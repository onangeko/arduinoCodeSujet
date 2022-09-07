AVR_ARDUINO = lib/ArduinoCore-avr-master
AVR_UART = lib/avr-uart-master
USB = /dev/cu.usbserial-1410

.SUFFIXES: .arduinoCode .c .cpp .s .o .elf .hex .fuse
JAVA = /usr/bin/java
CC = avr-gcc
CPP = avr-g++
AS = avr-as
SIZE = avr-size
#LD = avr-ld
LD = avr-gcc
OBJ_COPY = avr-objcopy
DUDE = avrdude

F_CPU = 16000000L
MCU = atmega328p

CC_FLAGS = -Os -mmcu=$(MCU) -DF_CPU=$(F_CPU) -std=gnu99
AS_FLAGS = -mmcu=$(MCU)
#LD_FLAGS = -m avr5
LD_FLAGS = -mmcu=$(MCU)

CC_INCL = -I$(AVR_ARDUINO)\
	-I$(AVR_ARDUINO)/cores/arduino\
	-I$(AVR_ARDUINO)/variants/standard\
	-I$(AVR_UART)

CC_OBJECTS = \
	$(AVR_ARDUINO)/cores/arduino/wiring_digital.o\
	$(AVR_ARDUINO)/cores/arduino/wiring_analog.o\
	$(AVR_ARDUINO)/cores/arduino/wiring.o\
	$(AVR_ARDUINO)/cores/arduino/hooks.o\
	$(AVR_UART)/uart.o  

.c.o:
	$(CC) $(CC_FLAGS) $(CC_INCL) -c -o $@ $<

.c.s:
	$(CC) $(AS_FLAGS) $(CC_INCL) -S -O0 -o $@ $<

.arduinoCode.s:
	$(JAVA) -cp classes fr.ubordeaux.arduinoCode.Main $< > $@ 2> $*.log

.s.o:
	$(AS) $(AS_FLAGS) -o $@ $<

.o.elf: 
	@make $(CC_OBJECTS) src/arduinoCodeMain.o 
	$(LD) $(LD_FLAGS) -o $@ $< $(CC_OBJECTS) src/arduinoCodeMain.o 

.elf.hex:
	$(SIZE) --format=avr --mcu=$(MCU) $<
	$(OBJ_COPY) -O ihex -R -eeprom $< $@

.hex.fuse:
	$(DUDE) -p $(MCU) -c arduino -P $(USB) -b115200 -D -U flash:w:$<:i > $@
	@rm $@




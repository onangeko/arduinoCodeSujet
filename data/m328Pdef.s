;;;--------------------------------------------------------------;
;;; ATmega328p
;;;--------------------------------------------------------------;

; ***** I/O REGISTER DEFINITIONS *****************************************
; NOTE:
; Definitions marked "MEMORY MAPPED"are extended I/O ports
; and cannot be used with IN/OUT instructions
.EQU	UDR0	, 0xc6	; MEMORY MAPPED
.EQU	UBRR0L	, 0xc4	; MEMORY MAPPED
.EQU	UBRR0H	, 0xc5	; MEMORY MAPPED
.EQU	UCSR0C	, 0xc2	; MEMORY MAPPED
.EQU	UCSR0B	, 0xc1	; MEMORY MAPPED
.EQU	UCSR0A	, 0xc0	; MEMORY MAPPED
.EQU	TWAMR	, 0xbd	; MEMORY MAPPED
.EQU	TWCR	, 0xbc	; MEMORY MAPPED
.EQU	TWDR	, 0xbb	; MEMORY MAPPED
.EQU	TWAR	, 0xba	; MEMORY MAPPED
.EQU	TWSR	, 0xb9	; MEMORY MAPPED
.EQU	TWBR	, 0xb8	; MEMORY MAPPED
.EQU	ASSR	, 0xb6	; MEMORY MAPPED
.EQU	OCR2B	, 0xb4	; MEMORY MAPPED
.EQU	OCR2A	, 0xb3	; MEMORY MAPPED
.EQU	TCNT2	, 0xb2	; MEMORY MAPPED
.EQU	TCCR2B	, 0xb1	; MEMORY MAPPED
.EQU	TCCR2A	, 0xb0	; MEMORY MAPPED
.EQU	OCR1BL	, 0x8a	; MEMORY MAPPED
.EQU	OCR1BH	, 0x8b	; MEMORY MAPPED
.EQU	OCR1AL	, 0x88	; MEMORY MAPPED
.EQU	OCR1AH	, 0x89	; MEMORY MAPPED
.EQU	ICR1L	, 0x86	; MEMORY MAPPED
.EQU	ICR1H	, 0x87	; MEMORY MAPPED
.EQU	TCNT1L	, 0x84	; MEMORY MAPPED
.EQU	TCNT1H	, 0x85	; MEMORY MAPPED
.EQU	TCCR1C	, 0x82	; MEMORY MAPPED
.EQU	TCCR1B	, 0x81	; MEMORY MAPPED
.EQU	TCCR1A	, 0x80	; MEMORY MAPPED
.EQU	DIDR1	, 0x7f	; MEMORY MAPPED
.EQU	DIDR0	, 0x7e	; MEMORY MAPPED
.EQU	ADMUX	, 0x7c	; MEMORY MAPPED
.EQU	ADCSRB	, 0x7b	; MEMORY MAPPED
.EQU	ADCSRA	, 0x7a	; MEMORY MAPPED
.EQU	ADCH	, 0x79	; MEMORY MAPPED
.EQU	ADCL	, 0x78	; MEMORY MAPPED
.EQU	TIMSK2	, 0x70	; MEMORY MAPPED
.EQU	TIMSK1	, 0x6f	; MEMORY MAPPED
.EQU	TIMSK0	, 0x6e	; MEMORY MAPPED
.EQU	PCMSK1	, 0x6c	; MEMORY MAPPED
.EQU	PCMSK2	, 0x6d	; MEMORY MAPPED
.EQU	PCMSK0	, 0x6b	; MEMORY MAPPED
.EQU	EICRA	, 0x69	; MEMORY MAPPED
.EQU	PCICR	, 0x68	; MEMORY MAPPED
.EQU	OSCCAL	, 0x66	; MEMORY MAPPED
.EQU	PRR	, 0x64	; MEMORY MAPPED
.EQU	CLKPR	, 0x61	; MEMORY MAPPED
.EQU	WDTCSR	, 0x60	; MEMORY MAPPED
.EQU	SREG	, 0x3f
.EQU	SPL	, 0x3d
.EQU	SPH	, 0x3e
.EQU	SPMCSR	, 0x37
.EQU	MCUCR	, 0x35
.EQU	MCUSR	, 0x34
.EQU	SMCR	, 0x33
.EQU	ACSR	, 0x30
.EQU	SPDR	, 0x2e
.EQU	SPSR	, 0x2d
.EQU	SPCR	, 0x2c
.EQU	GPIOR2	, 0x2b
.EQU	GPIOR1	, 0x2a
.EQU	OCR0B	, 0x28
.EQU	OCR0A	, 0x27
.EQU	TCNT0	, 0x26
.EQU	TCCR0B	, 0x25
.EQU	TCCR0A	, 0x24
.EQU	GTCCR	, 0x23
.EQU	EEARH	, 0x22
.EQU	EEARL	, 0x21
.EQU	EEDR	, 0x20
.EQU	EECR	, 0x1f
.EQU	GPIOR0	, 0x1e
.EQU	EIMSK	, 0x1d
.EQU	EIFR	, 0x1c
.EQU	PCIFR	, 0x1b
.EQU	TIFR2	, 0x17
.EQU	TIFR1	, 0x16
.EQU	TIFR0	, 0x15
.EQU	PORTD	, 0x0b
.EQU	DDRD	, 0x0a
.EQU	PIND	, 0x09
.EQU	PORTC	, 0x08
.EQU	DDRC	, 0x07
.EQU	PINC	, 0x06
.EQU	PORTB	, 0x05
.EQU	DDRB	, 0x04
.EQU	PINB	, 0x03


; ***** BIT DEFINITIONS **************************************************

; ***** USART0 ***********************
; UDR0 - USART I/O Data Register
.EQU	UDR0_0	, 0	; USART I/O Data Register bit 0
.EQU	UDR0_1	, 1	; USART I/O Data Register bit 1
.EQU	UDR0_2	, 2	; USART I/O Data Register bit 2
.EQU	UDR0_3	, 3	; USART I/O Data Register bit 3
.EQU	UDR0_4	, 4	; USART I/O Data Register bit 4
.EQU	UDR0_5	, 5	; USART I/O Data Register bit 5
.EQU	UDR0_6	, 6	; USART I/O Data Register bit 6
.EQU	UDR0_7	, 7	; USART I/O Data Register bit 7

; UCSR0A - USART Control and Status Register A
.EQU	MPCM0	, 0	; Multi-processor Communication Mode
.EQU	U2X0	, 1	; Double the USART transmission speed
.EQU	UPE0	, 2	; Parity Error
.EQU	DOR0	, 3	; Data overRun
.EQU	FE0	, 4	; Framing Error
.EQU	UDRE0	, 5	; USART Data Register Empty
.EQU	TXC0	, 6	; USART Transmitt Complete
.EQU	RXC0	, 7	; USART Receive Complete

; UCSR0B - USART Control and Status Register B
.EQU	TXB80	, 0	; Transmit Data Bit 8
.EQU	RXB80	, 1	; Receive Data Bit 8
.EQU	UCSZ02	, 2	; Character Size
.EQU	TXEN0	, 3	; Transmitter Enable
.EQU	RXEN0	, 4	; Receiver Enable
.EQU	UDRIE0	, 5	; USART Data register Empty Interrupt Enable
.EQU	TXCIE0	, 6	; TX Complete Interrupt Enable
.EQU	RXCIE0	, 7	; RX Complete Interrupt Enable

; UCSR0C - USART Control and Status Register C
.EQU	UCPOL0	, 0	; Clock Polarity
.EQU	UCSZ00	, 1	; Character Size
.EQU	UCPHA0	, UCSZ00	; For compatibility
.EQU	UCSZ01	, 2	; Character Size
.EQU	UDORD0	, UCSZ01	; For compatibility
.EQU	USBS0	, 3	; Stop Bit Select
.EQU	UPM00	, 4	; Parity Mode Bit 0
.EQU	UPM01	, 5	; Parity Mode Bit 1
.EQU	UMSEL00	, 6	; USART Mode Select
.EQU	UMSEL0	, UMSEL00	; For compatibility
.EQU	UMSEL01	, 7	; USART Mode Select
.EQU	UMSEL1	, UMSEL01	; For compatibility

; UBRR0H - USART Baud Rate Register High Byte
.EQU	UBRR8	, 0	; USART Baud Rate Register bit 8
.EQU	UBRR9	, 1	; USART Baud Rate Register bit 9
.EQU	UBRR10	, 2	; USART Baud Rate Register bit 10
.EQU	UBRR11	, 3	; USART Baud Rate Register bit 11

; UBRR0L - USART Baud Rate Register Low Byte
.EQU	_UBRR0	, 0	; USART Baud Rate Register bit 0
.EQU	_UBRR1	, 1	; USART Baud Rate Register bit 1
.EQU	UBRR2	, 2	; USART Baud Rate Register bit 2
.EQU	UBRR3	, 3	; USART Baud Rate Register bit 3
.EQU	UBRR4	, 4	; USART Baud Rate Register bit 4
.EQU	UBRR5	, 5	; USART Baud Rate Register bit 5
.EQU	UBRR6	, 6	; USART Baud Rate Register bit 6
.EQU	UBRR7	, 7	; USART Baud Rate Register bit 7


; ***** TWI **************************
; TWAMR - TWI (Slave) Address Mask Register
.EQU	TWAM0	, 1	; 
.EQU	TWAMR0	, TWAM0	; For compatibility
.EQU	TWAM1	, 2	; 
.EQU	TWAMR1	, TWAM1	; For compatibility
.EQU	TWAM2	, 3	; 
.EQU	TWAMR2	, TWAM2	; For compatibility
.EQU	TWAM3	, 4	; 
.EQU	TWAMR3	, TWAM3	; For compatibility
.EQU	TWAM4	, 5	; 
.EQU	TWAMR4	, TWAM4	; For compatibility
.EQU	TWAM5	, 6	; 
.EQU	TWAMR5	, TWAM5	; For compatibility
.EQU	TWAM6	, 7	; 
.EQU	TWAMR6	, TWAM6	; For compatibility

; TWBR - TWI Bit Rate register
.EQU	TWBR0	, 0	; 
.EQU	TWBR1	, 1	; 
.EQU	TWBR2	, 2	; 
.EQU	TWBR3	, 3	; 
.EQU	TWBR4	, 4	; 
.EQU	TWBR5	, 5	; 
.EQU	TWBR6	, 6	; 
.EQU	TWBR7	, 7	; 

; TWCR - TWI Control Register
.EQU	TWIE	, 0	; TWI Interrupt Enable
.EQU	TWEN	, 2	; TWI Enable Bit
.EQU	TWWC	, 3	; TWI Write Collition Flag
.EQU	TWSTO	, 4	; TWI Stop Condition Bit
.EQU	TWSTA	, 5	; TWI Start Condition Bit
.EQU	TWEA	, 6	; TWI Enable Acknowledge Bit
.EQU	TWINT	, 7	; TWI Interrupt Flag

; TWSR - TWI Status Register
.EQU	TWPS0	, 0	; TWI Prescaler
.EQU	TWPS1	, 1	; TWI Prescaler
.EQU	TWS3	, 3	; TWI Status
.EQU	TWS4	, 4	; TWI Status
.EQU	TWS5	, 5	; TWI Status
.EQU	TWS6	, 6	; TWI Status
.EQU	TWS7	, 7	; TWI Status

; TWDR - TWI Data register
.EQU	TWD0	, 0	; TWI Data Register Bit 0
.EQU	TWD1	, 1	; TWI Data Register Bit 1
.EQU	TWD2	, 2	; TWI Data Register Bit 2
.EQU	TWD3	, 3	; TWI Data Register Bit 3
.EQU	TWD4	, 4	; TWI Data Register Bit 4
.EQU	TWD5	, 5	; TWI Data Register Bit 5
.EQU	TWD6	, 6	; TWI Data Register Bit 6
.EQU	TWD7	, 7	; TWI Data Register Bit 7

; TWAR - TWI (Slave) Address register
.EQU	TWGCE	, 0	; TWI General Call Recognition Enable Bit
.EQU	TWA0	, 1	; TWI (Slave) Address register Bit 0
.EQU	TWA1	, 2	; TWI (Slave) Address register Bit 1
.EQU	TWA2	, 3	; TWI (Slave) Address register Bit 2
.EQU	TWA3	, 4	; TWI (Slave) Address register Bit 3
.EQU	TWA4	, 5	; TWI (Slave) Address register Bit 4
.EQU	TWA5	, 6	; TWI (Slave) Address register Bit 5
.EQU	TWA6	, 7	; TWI (Slave) Address register Bit 6


; ***** TIMER_COUNTER_1 **************
; TIMSK1 - Timer/Counter Interrupt Mask Register
.EQU	TOIE1	, 0	; Timer/Counter1 Overflow Interrupt Enable
.EQU	OCIE1A	, 1	; Timer/Counter1 Output CompareA Match Interrupt Enable
.EQU	OCIE1B	, 2	; Timer/Counter1 Output CompareB Match Interrupt Enable
.EQU	ICIE1	, 5	; Timer/Counter1 Input Capture Interrupt Enable

; TIFR1 - Timer/Counter Interrupt Flag register
.EQU	TOV1	, 0	; Timer/Counter1 Overflow Flag
.EQU	OCF1A	, 1	; Output Compare Flag 1A
.EQU	OCF1B	, 2	; Output Compare Flag 1B
.EQU	ICF1	, 5	; Input Capture Flag 1

; TCCR1A - Timer/Counter1 Control Register A
.EQU	WGM10	, 0	; Waveform Generation Mode
.EQU	WGM11	, 1	; Waveform Generation Mode
.EQU	COM1B0	, 4	; Compare Output Mode 1B, bit 0
.EQU	COM1B1	, 5	; Compare Output Mode 1B, bit 1
.EQU	COM1A0	, 6	; Comparet Ouput Mode 1A, bit 0
.EQU	COM1A1	, 7	; Compare Output Mode 1A, bit 1

; TCCR1B - Timer/Counter1 Control Register B
.EQU	CS10	, 0	; Prescaler source of Timer/Counter 1
.EQU	CS11	, 1	; Prescaler source of Timer/Counter 1
.EQU	CS12	, 2	; Prescaler source of Timer/Counter 1
.EQU	WGM12	, 3	; Waveform Generation Mode
.EQU	WGM13	, 4	; Waveform Generation Mode
.EQU	ICES1	, 6	; Input Capture 1 Edge Select
.EQU	ICNC1	, 7	; Input Capture 1 Noise Canceler

; TCCR1C - Timer/Counter1 Control Register C
.EQU	FOC1B	, 6	; 
.EQU	FOC1A	, 7	; 

; GTCCR - General Timer/Counter Control Register
.EQU	PSRSYNC	, 0	; Prescaler Reset Timer/Counter1 and Timer/Counter0
.EQU	TSM	, 7	; Timer/Counter Synchronization Mode


; ***** TIMER_COUNTER_2 **************
; TIMSK2 - Timer/Counter Interrupt Mask register
.EQU	TOIE2	, 0	; Timer/Counter2 Overflow Interrupt Enable
.EQU	TOIE2A	, TOIE2	; For compatibility
.EQU	OCIE2A	, 1	; Timer/Counter2 Output Compare Match A Interrupt Enable
.EQU	OCIE2B	, 2	; Timer/Counter2 Output Compare Match B Interrupt Enable

; TIFR2 - Timer/Counter Interrupt Flag Register
.EQU	TOV2	, 0	; Timer/Counter2 Overflow Flag
.EQU	OCF2A	, 1	; Output Compare Flag 2A
.EQU	OCF2B	, 2	; Output Compare Flag 2B

; TCCR2A - Timer/Counter2 Control Register A
.EQU	WGM20	, 0	; Waveform Genration Mode
.EQU	WGM21	, 1	; Waveform Genration Mode
.EQU	COM2B0	, 4	; Compare Output Mode bit 0
.EQU	COM2B1	, 5	; Compare Output Mode bit 1
.EQU	COM2A0	, 6	; Compare Output Mode bit 1
.EQU	COM2A1	, 7	; Compare Output Mode bit 1

; TCCR2B - Timer/Counter2 Control Register B
.EQU	CS20	, 0	; Clock Select bit 0
.EQU	CS21	, 1	; Clock Select bit 1
.EQU	CS22	, 2	; Clock Select bit 2
.EQU	WGM22	, 3	; Waveform Generation Mode
.EQU	FOC2B	, 6	; Force Output Compare B
.EQU	FOC2A	, 7	; Force Output Compare A

; TCNT2 - Timer/Counter2
.EQU	TCNT2_0	, 0	; Timer/Counter 2 bit 0
.EQU	TCNT2_1	, 1	; Timer/Counter 2 bit 1
.EQU	TCNT2_2	, 2	; Timer/Counter 2 bit 2
.EQU	TCNT2_3	, 3	; Timer/Counter 2 bit 3
.EQU	TCNT2_4	, 4	; Timer/Counter 2 bit 4
.EQU	TCNT2_5	, 5	; Timer/Counter 2 bit 5
.EQU	TCNT2_6	, 6	; Timer/Counter 2 bit 6
.EQU	TCNT2_7	, 7	; Timer/Counter 2 bit 7

; OCR2A - Timer/Counter2 Output Compare Register A
.EQU	OCR2A_0	, 0	; Timer/Counter2 Output Compare Register Bit 0
.EQU	OCR2A_1	, 1	; Timer/Counter2 Output Compare Register Bit 1
.EQU	OCR2A_2	, 2	; Timer/Counter2 Output Compare Register Bit 2
.EQU	OCR2A_3	, 3	; Timer/Counter2 Output Compare Register Bit 3
.EQU	OCR2A_4	, 4	; Timer/Counter2 Output Compare Register Bit 4
.EQU	OCR2A_5	, 5	; Timer/Counter2 Output Compare Register Bit 5
.EQU	OCR2A_6	, 6	; Timer/Counter2 Output Compare Register Bit 6
.EQU	OCR2A_7	, 7	; Timer/Counter2 Output Compare Register Bit 7

; OCR2B - Timer/Counter2 Output Compare Register B
.EQU	OCR2B_0	, 0	; Timer/Counter2 Output Compare Register Bit 0
.EQU	OCR2B_1	, 1	; Timer/Counter2 Output Compare Register Bit 1
.EQU	OCR2B_2	, 2	; Timer/Counter2 Output Compare Register Bit 2
.EQU	OCR2B_3	, 3	; Timer/Counter2 Output Compare Register Bit 3
.EQU	OCR2B_4	, 4	; Timer/Counter2 Output Compare Register Bit 4
.EQU	OCR2B_5	, 5	; Timer/Counter2 Output Compare Register Bit 5
.EQU	OCR2B_6	, 6	; Timer/Counter2 Output Compare Register Bit 6
.EQU	OCR2B_7	, 7	; Timer/Counter2 Output Compare Register Bit 7

; ASSR - Asynchronous Status Register
.EQU	TCR2BUB	, 0	; Timer/Counter Control Register2 Update Busy
.EQU	TCR2AUB	, 1	; Timer/Counter Control Register2 Update Busy
.EQU	OCR2BUB	, 2	; Output Compare Register 2 Update Busy
.EQU	OCR2AUB	, 3	; Output Compare Register2 Update Busy
.EQU	TCN2UB	, 4	; Timer/Counter2 Update Busy
.EQU	AS2	, 5	; Asynchronous Timer/Counter2
.EQU	EXCLK	, 6	; Enable External Clock Input

; GTCCR - General Timer Counter Control register
.EQU	PSRASY	, 1	; Prescaler Reset Timer/Counter2
.EQU	PSR2	, PSRASY	; For compatibility
;.EQU	TSM	, 7	; Timer/Counter Synchronization Mode


; ***** AD_CONVERTER *****************
; ADMUX - The ADC multiplexer Selection Register
.EQU	MUX0	, 0	; Analog Channel and Gain Selection Bits
.EQU	MUX1	, 1	; Analog Channel and Gain Selection Bits
.EQU	MUX2	, 2	; Analog Channel and Gain Selection Bits
.EQU	MUX3	, 3	; Analog Channel and Gain Selection Bits
.EQU	ADLAR	, 5	; Left Adjust Result
.EQU	REFS0	, 6	; Reference Selection Bit 0
.EQU	REFS1	, 7	; Reference Selection Bit 1

; ADCSRA - The ADC Control and Status register A
.EQU	ADPS0	, 0	; ADC  Prescaler Select Bits
.EQU	ADPS1	, 1	; ADC  Prescaler Select Bits
.EQU	ADPS2	, 2	; ADC  Prescaler Select Bits
.EQU	ADIE	, 3	; ADC Interrupt Enable
.EQU	ADIF	, 4	; ADC Interrupt Flag
.EQU	ADATE	, 5	; ADC  Auto Trigger Enable
.EQU	ADSC	, 6	; ADC Start Conversion
.EQU	ADEN	, 7	; ADC Enable

; ADCSRB - The ADC Control and Status register B
.EQU	ADTS0	, 0	; ADC Auto Trigger Source bit 0
.EQU	ADTS1	, 1	; ADC Auto Trigger Source bit 1
.EQU	ADTS2	, 2	; ADC Auto Trigger Source bit 2
.EQU	ACME	, 6	; 

; ADCH - ADC Data Register High Byte
.EQU	ADCH0	, 0	; ADC Data Register High Byte Bit 0
.EQU	ADCH1	, 1	; ADC Data Register High Byte Bit 1
.EQU	ADCH2	, 2	; ADC Data Register High Byte Bit 2
.EQU	ADCH3	, 3	; ADC Data Register High Byte Bit 3
.EQU	ADCH4	, 4	; ADC Data Register High Byte Bit 4
.EQU	ADCH5	, 5	; ADC Data Register High Byte Bit 5
.EQU	ADCH6	, 6	; ADC Data Register High Byte Bit 6
.EQU	ADCH7	, 7	; ADC Data Register High Byte Bit 7

; ADCL - ADC Data Register Low Byte
.EQU	ADCL0	, 0	; ADC Data Register Low Byte Bit 0
.EQU	ADCL1	, 1	; ADC Data Register Low Byte Bit 1
.EQU	ADCL2	, 2	; ADC Data Register Low Byte Bit 2
.EQU	ADCL3	, 3	; ADC Data Register Low Byte Bit 3
.EQU	ADCL4	, 4	; ADC Data Register Low Byte Bit 4
.EQU	ADCL5	, 5	; ADC Data Register Low Byte Bit 5
.EQU	ADCL6	, 6	; ADC Data Register Low Byte Bit 6
.EQU	ADCL7	, 7	; ADC Data Register Low Byte Bit 7

; DIDR0 - Digital Input Disable Register
.EQU	ADC0D	, 0	; 
.EQU	ADC1D	, 1	; 
.EQU	ADC2D	, 2	; 
.EQU	ADC3D	, 3	; 
.EQU	ADC4D	, 4	; 
.EQU	ADC5D	, 5	; 


; ***** ANALOG_COMPARATOR ************
; ACSR - Analog Comparator Control And Status Register
.EQU	ACIS0	, 0	; Analog Comparator Interrupt Mode Select bit 0
.EQU	ACIS1	, 1	; Analog Comparator Interrupt Mode Select bit 1
.EQU	ACIC	, 2	; Analog Comparator Input Capture Enable
.EQU	ACIE	, 3	; Analog Comparator Interrupt Enable
.EQU	ACI	, 4	; Analog Comparator Interrupt Flag
.EQU	ACO	, 5	; Analog Compare Output
.EQU	ACBG	, 6	; Analog Comparator Bandgap Select
.EQU	ACD	, 7	; Analog Comparator Disable

; DIDR1 - Digital Input Disable Register 1
.EQU	AIN0D	, 0	; AIN0 Digital Input Disable
.EQU	AIN1D	, 1	; AIN1 Digital Input Disable


; ***** PORTB ************************
; PORTB - Port B Data Register
.EQU	PORTB0	, 0	; Port B Data Register bit 0
.EQU	PB0	, 0	; For compatibility
.EQU	PORTB1	, 1	; Port B Data Register bit 1
.EQU	PB1	, 1	; For compatibility
.EQU	PORTB2	, 2	; Port B Data Register bit 2
.EQU	PB2	, 2	; For compatibility
.EQU	PORTB3	, 3	; Port B Data Register bit 3
.EQU	PB3	, 3	; For compatibility
.EQU	PORTB4	, 4	; Port B Data Register bit 4
.EQU	PB4	, 4	; For compatibility
.EQU	PORTB5	, 5	; Port B Data Register bit 5
.EQU	PB5	, 5	; For compatibility
.EQU	PORTB6	, 6	; Port B Data Register bit 6
.EQU	PB6	, 6	; For compatibility
.EQU	PORTB7	, 7	; Port B Data Register bit 7
.EQU	PB7	, 7	; For compatibility

; DDRB - Port B Data Direction Register
.EQU	DDB0	, 0	; Port B Data Direction Register bit 0
.EQU	DDB1	, 1	; Port B Data Direction Register bit 1
.EQU	DDB2	, 2	; Port B Data Direction Register bit 2
.EQU	DDB3	, 3	; Port B Data Direction Register bit 3
.EQU	DDB4	, 4	; Port B Data Direction Register bit 4
.EQU	DDB5	, 5	; Port B Data Direction Register bit 5
.EQU	DDB6	, 6	; Port B Data Direction Register bit 6
.EQU	DDB7	, 7	; Port B Data Direction Register bit 7

; PINB - Port B Input Pins
.EQU	PINB0	, 0	; Port B Input Pins bit 0
.EQU	PINB1	, 1	; Port B Input Pins bit 1
.EQU	PINB2	, 2	; Port B Input Pins bit 2
.EQU	PINB3	, 3	; Port B Input Pins bit 3
.EQU	PINB4	, 4	; Port B Input Pins bit 4
.EQU	PINB5	, 5	; Port B Input Pins bit 5
.EQU	PINB6	, 6	; Port B Input Pins bit 6
.EQU	PINB7	, 7	; Port B Input Pins bit 7


; ***** PORTC ************************
; PORTC - Port C Data Register
.EQU	PORTC0	, 0	; Port C Data Register bit 0
.EQU	PC0	, 0	; For compatibility
.EQU	PORTC1	, 1	; Port C Data Register bit 1
.EQU	PC1	, 1	; For compatibility
.EQU	PORTC2	, 2	; Port C Data Register bit 2
.EQU	PC2	, 2	; For compatibility
.EQU	PORTC3	, 3	; Port C Data Register bit 3
.EQU	PC3	, 3	; For compatibility
.EQU	PORTC4	, 4	; Port C Data Register bit 4
.EQU	PC4	, 4	; For compatibility
.EQU	PORTC5	, 5	; Port C Data Register bit 5
.EQU	PC5	, 5	; For compatibility
.EQU	PORTC6	, 6	; Port C Data Register bit 6
.EQU	PC6	, 6	; For compatibility

; DDRC - Port C Data Direction Register
.EQU	DDC0	, 0	; Port C Data Direction Register bit 0
.EQU	DDC1	, 1	; Port C Data Direction Register bit 1
.EQU	DDC2	, 2	; Port C Data Direction Register bit 2
.EQU	DDC3	, 3	; Port C Data Direction Register bit 3
.EQU	DDC4	, 4	; Port C Data Direction Register bit 4
.EQU	DDC5	, 5	; Port C Data Direction Register bit 5
.EQU	DDC6	, 6	; Port C Data Direction Register bit 6

; PINC - Port C Input Pins
.EQU	PINC0	, 0	; Port C Input Pins bit 0
.EQU	PINC1	, 1	; Port C Input Pins bit 1
.EQU	PINC2	, 2	; Port C Input Pins bit 2
.EQU	PINC3	, 3	; Port C Input Pins bit 3
.EQU	PINC4	, 4	; Port C Input Pins bit 4
.EQU	PINC5	, 5	; Port C Input Pins bit 5
.EQU	PINC6	, 6	; Port C Input Pins bit 6


; ***** PORTD ************************
; PORTD - Port D Data Register
.EQU	PORTD0	, 0	; Port D Data Register bit 0
.EQU	PD0	, 0	; For compatibility
.EQU	PORTD1	, 1	; Port D Data Register bit 1
.EQU	PD1	, 1	; For compatibility
.EQU	PORTD2	, 2	; Port D Data Register bit 2
.EQU	PD2	, 2	; For compatibility
.EQU	PORTD3	, 3	; Port D Data Register bit 3
.EQU	PD3	, 3	; For compatibility
.EQU	PORTD4	, 4	; Port D Data Register bit 4
.EQU	PD4	, 4	; For compatibility
.EQU	PORTD5	, 5	; Port D Data Register bit 5
.EQU	PD5	, 5	; For compatibility
.EQU	PORTD6	, 6	; Port D Data Register bit 6
.EQU	PD6	, 6	; For compatibility
.EQU	PORTD7	, 7	; Port D Data Register bit 7
.EQU	PD7	, 7	; For compatibility

; DDRD - Port D Data Direction Register
.EQU	DDD0	, 0	; Port D Data Direction Register bit 0
.EQU	DDD1	, 1	; Port D Data Direction Register bit 1
.EQU	DDD2	, 2	; Port D Data Direction Register bit 2
.EQU	DDD3	, 3	; Port D Data Direction Register bit 3
.EQU	DDD4	, 4	; Port D Data Direction Register bit 4
.EQU	DDD5	, 5	; Port D Data Direction Register bit 5
.EQU	DDD6	, 6	; Port D Data Direction Register bit 6
.EQU	DDD7	, 7	; Port D Data Direction Register bit 7

; PIND - Port D Input Pins
.EQU	PIND0	, 0	; Port D Input Pins bit 0
.EQU	PIND1	, 1	; Port D Input Pins bit 1
.EQU	PIND2	, 2	; Port D Input Pins bit 2
.EQU	PIND3	, 3	; Port D Input Pins bit 3
.EQU	PIND4	, 4	; Port D Input Pins bit 4
.EQU	PIND5	, 5	; Port D Input Pins bit 5
.EQU	PIND6	, 6	; Port D Input Pins bit 6
.EQU	PIND7	, 7	; Port D Input Pins bit 7


; ***** TIMER_COUNTER_0 **************
; TIMSK0 - Timer/Counter0 Interrupt Mask Register
.EQU	TOIE0	, 0	; Timer/Counter0 Overflow Interrupt Enable
.EQU	OCIE0A	, 1	; Timer/Counter0 Output Compare Match A Interrupt Enable
.EQU	OCIE0B	, 2	; Timer/Counter0 Output Compare Match B Interrupt Enable

; TIFR0 - Timer/Counter0 Interrupt Flag register
.EQU	TOV0	, 0	; Timer/Counter0 Overflow Flag
.EQU	OCF0A	, 1	; Timer/Counter0 Output Compare Flag 0A
.EQU	OCF0B	, 2	; Timer/Counter0 Output Compare Flag 0B

; TCCR0A - Timer/Counter  Control Register A
.EQU	WGM00	, 0	; Waveform Generation Mode
.EQU	WGM01	, 1	; Waveform Generation Mode
.EQU	COM0B0	, 4	; Compare Output Mode, Fast PWm
.EQU	COM0B1	, 5	; Compare Output Mode, Fast PWm
.EQU	COM0A0	, 6	; Compare Output Mode, Phase Correct PWM Mode
.EQU	COM0A1	, 7	; Compare Output Mode, Phase Correct PWM Mode

; TCCR0B - Timer/Counter Control Register B
.EQU	CS00	, 0	; Clock Select
.EQU	CS01	, 1	; Clock Select
.EQU	CS02	, 2	; Clock Select
.EQU	WGM02	, 3	; 
.EQU	FOC0B	, 6	; Force Output Compare B
.EQU	FOC0A	, 7	; Force Output Compare A

; TCNT0 - Timer/Counter0
.EQU	TCNT0_0	, 0	; 
.EQU	TCNT0_1	, 1	; 
.EQU	TCNT0_2	, 2	; 
.EQU	TCNT0_3	, 3	; 
.EQU	TCNT0_4	, 4	; 
.EQU	TCNT0_5	, 5	; 
.EQU	TCNT0_6	, 6	; 
.EQU	TCNT0_7	, 7	; 

; OCR0A - Timer/Counter0 Output Compare Register
.EQU	OCR0A_0	, 0	; 
.EQU	OCR0A_1	, 1	; 
.EQU	OCR0A_2	, 2	; 
.EQU	OCR0A_3	, 3	; 
.EQU	OCR0A_4	, 4	; 
.EQU	OCR0A_5	, 5	; 
.EQU	OCR0A_6	, 6	; 
.EQU	OCR0A_7	, 7	; 

; OCR0B - Timer/Counter0 Output Compare Register
.EQU	OCR0B_0	, 0	; 
.EQU	OCR0B_1	, 1	; 
.EQU	OCR0B_2	, 2	; 
.EQU	OCR0B_3	, 3	; 
.EQU	OCR0B_4	, 4	; 
.EQU	OCR0B_5	, 5	; 
.EQU	OCR0B_6	, 6	; 
.EQU	OCR0B_7	, 7	; 

; GTCCR - General Timer/Counter Control Register
;.EQU	PSRSYNC	, 0	; Prescaler Reset Timer/Counter1 and Timer/Counter0
.EQU	PSR10	, PSRSYNC	; For compatibility
;.EQU	TSM	, 7	; Timer/Counter Synchronization Mode


; ***** EXTERNAL_INTERRUPT ***********
; EICRA - External Interrupt Control Register
.EQU	ISC00	, 0	; External Interrupt Sense Control 0 Bit 0
.EQU	ISC01	, 1	; External Interrupt Sense Control 0 Bit 1
.EQU	ISC10	, 2	; External Interrupt Sense Control 1 Bit 0
.EQU	ISC11	, 3	; External Interrupt Sense Control 1 Bit 1

; EIMSK - External Interrupt Mask Register
.EQU	INT0	, 0	; External Interrupt Request 0 Enable
.EQU	INT1	, 1	; External Interrupt Request 1 Enable

; EIFR - External Interrupt Flag Register
.EQU	INTF0	, 0	; External Interrupt Flag 0
.EQU	INTF1	, 1	; External Interrupt Flag 1

; PCICR - Pin Change Interrupt Control Register
.EQU	PCIE0	, 0	; Pin Change Interrupt Enable 0
.EQU	PCIE1	, 1	; Pin Change Interrupt Enable 1
.EQU	PCIE2	, 2	; Pin Change Interrupt Enable 2

; PCMSK2 - Pin Change Mask Register 2
.EQU	PCINT16	, 0	; Pin Change Enable Mask 16
.EQU	PCINT17	, 1	; Pin Change Enable Mask 17
.EQU	PCINT18	, 2	; Pin Change Enable Mask 18
.EQU	PCINT19	, 3	; Pin Change Enable Mask 19
.EQU	PCINT20	, 4	; Pin Change Enable Mask 20
.EQU	PCINT21	, 5	; Pin Change Enable Mask 21
.EQU	PCINT22	, 6	; Pin Change Enable Mask 22
.EQU	PCINT23	, 7	; Pin Change Enable Mask 23

; PCMSK1 - Pin Change Mask Register 1
.EQU	PCINT8	, 0	; Pin Change Enable Mask 8
.EQU	PCINT9	, 1	; Pin Change Enable Mask 9
.EQU	PCINT10	, 2	; Pin Change Enable Mask 10
.EQU	PCINT11	, 3	; Pin Change Enable Mask 11
.EQU	PCINT12	, 4	; Pin Change Enable Mask 12
.EQU	PCINT13	, 5	; Pin Change Enable Mask 13
.EQU	PCINT14	, 6	; Pin Change Enable Mask 14

; PCMSK0 - Pin Change Mask Register 0
.EQU	PCINT0	, 0	; Pin Change Enable Mask 0
.EQU	PCINT1	, 1	; Pin Change Enable Mask 1
.EQU	PCINT2	, 2	; Pin Change Enable Mask 2
.EQU	PCINT3	, 3	; Pin Change Enable Mask 3
.EQU	PCINT4	, 4	; Pin Change Enable Mask 4
.EQU	PCINT5	, 5	; Pin Change Enable Mask 5
.EQU	PCINT6	, 6	; Pin Change Enable Mask 6
.EQU	PCINT7	, 7	; Pin Change Enable Mask 7

; PCIFR - Pin Change Interrupt Flag Register
.EQU	PCIF0	, 0	; Pin Change Interrupt Flag 0
.EQU	PCIF1	, 1	; Pin Change Interrupt Flag 1
.EQU	PCIF2	, 2	; Pin Change Interrupt Flag 2


; ***** SPI **************************
; SPDR - SPI Data Register
.EQU	SPDR0	, 0	; SPI Data Register bit 0
.EQU	SPDR1	, 1	; SPI Data Register bit 1
.EQU	SPDR2	, 2	; SPI Data Register bit 2
.EQU	SPDR3	, 3	; SPI Data Register bit 3
.EQU	SPDR4	, 4	; SPI Data Register bit 4
.EQU	SPDR5	, 5	; SPI Data Register bit 5
.EQU	SPDR6	, 6	; SPI Data Register bit 6
.EQU	SPDR7	, 7	; SPI Data Register bit 7

; SPSR - SPI Status Register
.EQU	SPI2X	, 0	; Double SPI Speed Bit
.EQU	WCOL	, 6	; Write Collision Flag
.EQU	SPIF	, 7	; SPI Interrupt Flag

; SPCR - SPI Control Register
.EQU	SPR0	, 0	; SPI Clock Rate Select 0
.EQU	SPR1	, 1	; SPI Clock Rate Select 1
.EQU	CPHA	, 2	; Clock Phase
.EQU	CPOL	, 3	; Clock polarity
.EQU	MSTR	, 4	; Master/Slave Select
.EQU	DORD	, 5	; Data Order
.EQU	SPE	, 6	; SPI Enable
.EQU	SPIE	, 7	; SPI Interrupt Enable


; ***** WATCHDOG *********************
; WDTCSR - Watchdog Timer Control Register
.EQU	WDP0	, 0	; Watch Dog Timer Prescaler bit 0
.EQU	WDP1	, 1	; Watch Dog Timer Prescaler bit 1
.EQU	WDP2	, 2	; Watch Dog Timer Prescaler bit 2
.EQU	WDE	, 3	; Watch Dog Enable
.EQU	WDCE	, 4	; Watchdog Change Enable
.EQU	WDP3	, 5	; Watchdog Timer Prescaler Bit 3
.EQU	WDIE	, 6	; Watchdog Timeout Interrupt Enable
.EQU	WDIF	, 7	; Watchdog Timeout Interrupt Flag


; ***** CPU **************************
; SREG - Status Register
.EQU	SREG_C	, 0	; Carry Flag
.EQU	SREG_Z	, 1	; Zero Flag
.EQU	SREG_N	, 2	; Negative Flag
.EQU	SREG_V	, 3	; Two's Complement Overflow Flag
.EQU	SREG_S	, 4	; Sign Bit
.EQU	SREG_H	, 5	; Half Carry Flag
.EQU	SREG_T	, 6	; Bit Copy Storage
.EQU	SREG_I	, 7	; Global Interrupt Enable

; OSCCAL - Oscillator Calibration Value
.EQU	CAL0	, 0	; Oscillator Calibration Value Bit0
.EQU	CAL1	, 1	; Oscillator Calibration Value Bit1
.EQU	CAL2	, 2	; Oscillator Calibration Value Bit2
.EQU	CAL3	, 3	; Oscillator Calibration Value Bit3
.EQU	CAL4	, 4	; Oscillator Calibration Value Bit4
.EQU	CAL5	, 5	; Oscillator Calibration Value Bit5
.EQU	CAL6	, 6	; Oscillator Calibration Value Bit6
.EQU	CAL7	, 7	; Oscillator Calibration Value Bit7

; CLKPR - Clock Prescale Register
.EQU	CLKPS0	, 0	; Clock Prescaler Select Bit 0
.EQU	CLKPS1	, 1	; Clock Prescaler Select Bit 1
.EQU	CLKPS2	, 2	; Clock Prescaler Select Bit 2
.EQU	CLKPS3	, 3	; Clock Prescaler Select Bit 3
.EQU	CLKPCE	, 7	; Clock Prescaler Change Enable

; SPMCSR - Store Program Memory Control and Status Register
.EQU	SELFPRGEN	, 0	; Self Programming Enable
.EQU	PGERS	, 1	; Page Erase
.EQU	PGWRT	, 2	; Page Write
.EQU	BLBSET	, 3	; Boot Lock Bit Set
.EQU	RWWSRE	, 4	; Read-While-Write section read enable
.EQU	RWWSB	, 6	; Read-While-Write Section Busy
.EQU	SPMIE	, 7	; SPM Interrupt Enable

; MCUCR - MCU Control Register
.EQU	IVCE	, 0	; 
.EQU	IVSEL	, 1	; 
.EQU	PUD	, 4	; 
.EQU	BODSE	, 5	; BOD Sleep Enable
.EQU	BODS	, 6	; BOD Sleep

; MCUSR - MCU Status Register
.EQU	PORF	, 0	; Power-on reset flag
.EQU	EXTRF	, 1	; External Reset Flag
.EQU	EXTREF	, EXTRF	; For compatibility
.EQU	BORF	, 2	; Brown-out Reset Flag
.EQU	WDRF	, 3	; Watchdog Reset Flag

; SMCR - Sleep Mode Control Register
.EQU	SE	, 0	; Sleep Enable
.EQU	SM0	, 1	; Sleep Mode Select Bit 0
.EQU	SM1	, 2	; Sleep Mode Select Bit 1
.EQU	SM2	, 3	; Sleep Mode Select Bit 2

; GPIOR2 - General Purpose I/O Register 2
.EQU	GPIOR20	, 0	; 
.EQU	GPIOR21	, 1	; 
.EQU	GPIOR22	, 2	; 
.EQU	GPIOR23	, 3	; 
.EQU	GPIOR24	, 4	; 
.EQU	GPIOR25	, 5	; 
.EQU	GPIOR26	, 6	; 
.EQU	GPIOR27	, 7	; 

; GPIOR1 - General Purpose I/O Register 1
.EQU	GPIOR10	, 0	; 
.EQU	GPIOR11	, 1	; 
.EQU	GPIOR12	, 2	; 
.EQU	GPIOR13	, 3	; 
.EQU	GPIOR14	, 4	; 
.EQU	GPIOR15	, 5	; 
.EQU	GPIOR16	, 6	; 
.EQU	GPIOR17	, 7	; 

; GPIOR0 - General Purpose I/O Register 0
.EQU	GPIOR00	, 0	; 
.EQU	GPIOR01	, 1	; 
.EQU	GPIOR02	, 2	; 
.EQU	GPIOR03	, 3	; 
.EQU	GPIOR04	, 4	; 
.EQU	GPIOR05	, 5	; 
.EQU	GPIOR06	, 6	; 
.EQU	GPIOR07	, 7	; 

; PRR - Power Reduction Register
.EQU	PRADC	, 0	; Power Reduction ADC
.EQU	PRUSART0	, 1	; Power Reduction USART
.EQU	PRSPI	, 2	; Power Reduction Serial Peripheral Interface
.EQU	PRTIM1	, 3	; Power Reduction Timer/Counter1
.EQU	PRTIM0	, 5	; Power Reduction Timer/Counter0
.EQU	PRTIM2	, 6	; Power Reduction Timer/Counter2
.EQU	PRTWI	, 7	; Power Reduction TWI


; ***** EEPROM ***********************
; EEARL - EEPROM Address Register Low Byte
.EQU	EEAR0	, 0	; EEPROM Read/Write Access Bit 0
.EQU	EEAR1	, 1	; EEPROM Read/Write Access Bit 1
.EQU	EEAR2	, 2	; EEPROM Read/Write Access Bit 2
.EQU	EEAR3	, 3	; EEPROM Read/Write Access Bit 3
.EQU	EEAR4	, 4	; EEPROM Read/Write Access Bit 4
.EQU	EEAR5	, 5	; EEPROM Read/Write Access Bit 5
.EQU	EEAR6	, 6	; EEPROM Read/Write Access Bit 6
.EQU	EEAR7	, 7	; EEPROM Read/Write Access Bit 7

; EEARH - EEPROM Address Register High Byte
.EQU	EEAR8	, 0	; EEPROM Read/Write Access Bit 8
.EQU	EEAR9	, 1	; EEPROM Read/Write Access Bit 9

; EEDR - EEPROM Data Register
.EQU	EEDR0	, 0	; EEPROM Data Register bit 0
.EQU	EEDR1	, 1	; EEPROM Data Register bit 1
.EQU	EEDR2	, 2	; EEPROM Data Register bit 2
.EQU	EEDR3	, 3	; EEPROM Data Register bit 3
.EQU	EEDR4	, 4	; EEPROM Data Register bit 4
.EQU	EEDR5	, 5	; EEPROM Data Register bit 5
.EQU	EEDR6	, 6	; EEPROM Data Register bit 6
.EQU	EEDR7	, 7	; EEPROM Data Register bit 7

; EECR - EEPROM Control Register
.EQU	EERE	, 0	; EEPROM Read Enable
.EQU	EEPE	, 1	; EEPROM Write Enable
.EQU	EEMPE	, 2	; EEPROM Master Write Enable
.EQU	EERIE	, 3	; EEPROM Ready Interrupt Enable
.EQU	EEPM0	, 4	; EEPROM Programming Mode Bit 0
.EQU	EEPM1	, 5	; EEPROM Programming Mode Bit 1



; ***** LOCKSBITS ********************************************************
.EQU	LB1	, 0	; Lock bit
.EQU	LB2	, 1	; Lock bit
.EQU	BLB01	, 2	; Boot Lock bit
.EQU	BLB02	, 3	; Boot Lock bit
.EQU	BLB11	, 4	; Boot lock bit
.EQU	BLB12	, 5	; Boot lock bit


; ***** FUSES ************************************************************
; LOW fuse bits
.EQU	CKSEL0	, 0	; Select Clock Source
.EQU	CKSEL1	, 1	; Select Clock Source
.EQU	CKSEL2	, 2	; Select Clock Source
.EQU	CKSEL3	, 3	; Select Clock Source
.EQU	SUT0	, 4	; Select start-up time
.EQU	SUT1	, 5	; Select start-up time
.EQU	CKOUT	, 6	; Clock output
.EQU	CKDIV8	, 7	; Divide clock by 8

; HIGH fuse bits
.EQU	BOOTRST	, 0	; Select reset vector
.EQU	BOOTSZ0	, 1	; Select boot size
.EQU	BOOTSZ1	, 2	; Select boot size
.EQU	EESAVE	, 3	; EEPROM memory is preserved through chip erase
.EQU	WDTON	, 4	; Watchdog Timer Always On
.EQU	SPIEN	, 5	; Enable Serial programming and Data Downloading
.EQU	DWEN	, 6	; debugWIRE Enable
.EQU	RSTDISBL	, 7	; External reset disable

; EXTENDED fuse bits
.EQU	BODLEVEL0	, 0	; Brown-out Detector trigger level
.EQU	BODLEVEL1	, 1	; Brown-out Detector trigger level
.EQU	BODLEVEL2	, 2	; Brown-out Detector trigger level


; ***** DATA MEMORY DECLARATIONS *****************************************
.EQU	FLASHEND	, 0x3fff	; Note: Word address
.EQU	IOEND	, 0x00ff
.EQU	SRAM_START	, 0x0100
.EQU	SRAM_SIZE	, 2048
.EQU	RAMEND	, 0x08ff
.EQU	XRAMEND	, 0x0000
.EQU	E2END	, 0x03ff
.EQU	EEPROMEND	, 0x03ff
.EQU	EEADRBITS	, 10
#pragma AVRPART MEMORY PROG_FLASH 32768
#pragma AVRPART MEMORY EEPROM 1024
#pragma AVRPART MEMORY INT_SRAM SIZE 2048
#pragma AVRPART MEMORY INT_SRAM START_ADDR 0x100


		

; ***** BOOTLOADER DECLARATIONS ******************************************
.EQU	NRWW_START_ADDR	, 0x3800
.EQU	NRWW_STOP_ADDR	, 0x3fff
.EQU	RWW_START_ADDR	, 0x0
.EQU	RWW_STOP_ADDR	, 0x37ff
.EQU	PAGESIZE	, 64
.EQU	FIRSTBOOTSTART	, 0x3f00
.EQU	SECONDBOOTSTART	, 0x3e00
.EQU	THIRDBOOTSTART	, 0x3c00
.EQU	FOURTHBOOTSTART	, 0x3800
.EQU	SMALLBOOTSTART	, FIRSTBOOTSTART
.EQU	LARGEBOOTSTART	, FOURTHBOOTSTART



; ***** INTERRUPT VECTORS ************************************************
.EQU	INT0addr	, 0x0002	; External Interrupt Request 0
.EQU	INT1addr	, 0x0004	; External Interrupt Request 1
.EQU	PCI0addr	, 0x0006	; Pin Change Interrupt Request 0
.EQU	PCI1addr	, 0x0008	; Pin Change Interrupt Request 0
.EQU	PCI2addr	, 0x000a	; Pin Change Interrupt Request 1
.EQU	WDTaddr	, 0x000c	; Watchdog Time-out Interrupt
.EQU	OC2Aaddr	, 0x000e	; Timer/Counter2 Compare Match A
.EQU	OC2Baddr	, 0x0010	; Timer/Counter2 Compare Match A
.EQU	OVF2addr	, 0x0012	; Timer/Counter2 Overflow
.EQU	ICP1addr	, 0x0014	; Timer/Counter1 Capture Event
.EQU	OC1Aaddr	, 0x0016	; Timer/Counter1 Compare Match A
.EQU	OC1Baddr	, 0x0018	; Timer/Counter1 Compare Match B
.EQU	OVF1addr	, 0x001a	; Timer/Counter1 Overflow
.EQU	OC0Aaddr	, 0x001c	; TimerCounter0 Compare Match A
.EQU	OC0Baddr	, 0x001e	; TimerCounter0 Compare Match B
.EQU	OVF0addr	, 0x0020	; Timer/Couner0 Overflow
.EQU	SPIaddr	, 0x0022	; SPI Serial Transfer Complete
.EQU	URXCaddr	, 0x0024	; USART Rx Complete
.EQU	UDREaddr	, 0x0026	; USART, Data Register Empty
.EQU	UTXCaddr	, 0x0028	; USART Tx Complete
.EQU	ADCCaddr	, 0x002a	; ADC Conversion Complete
.EQU	ERDYaddr	, 0x002c	; EEPROM Ready
.EQU	ACIaddr	, 0x002e	; Analog Comparator
.EQU	TWIaddr	, 0x0030	; Two-wire Serial Interface
.EQU	SPMRaddr	, 0x0032	; Store Program Memory Read

.EQU	INT_VECTORS_SIZE	, 52	; size in words

.EQU LED_BUILTIN, 13
.EQU HIGH, 0xFF
.EQU LOW, 0

.EQU INPUT, 0x0
.EQU INPUT_PULLUP, 0x2
.EQU OUTPUT, 0x1


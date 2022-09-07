#include <stdio.h>
#include <Arduino.h>
#include <util/delay.h>
#include "uart.h"

/* Define CPU frequency in Hz in Makefile or toolchain compiler configuration */
#ifndef F_CPU
#error "F_CPU undefined, please define CPU frequency in Hz in Makefile"
#endif

/* Define UART baud rate here */
#define UART_BAUD_RATE 9600	

// Définir ici les fonctions externes
extern void main_program();

int main(void){

  /*
   *  Initialize UART library, pass baudrate and AVR cpu clock
   *  with the macro
   *  UART_BAUD_SELECT() (normal speed mode)
   *  or
   *  UART_BAUD_SELECT_DOUBLE_SPEED() (double speed mode)
   */
  uart_init(UART_BAUD_SELECT(UART_BAUD_RATE, F_CPU));
  _delay_ms(150);
  
  /*
   * Now enable interrupt, since UART library is interrupt controlled
   */
  sei();
  _delay_ms(150);
  
  main_program();
  return 0;
}

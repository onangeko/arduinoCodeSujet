;; Lionel Clément
;; Quelques routines de délai

;; void delay_ms(uint16_t milliseconds)
;; arguments in r25, r24
;; r24 * 0xFF * r25 * (16 000) cycles
.global delay_ms
delay_ms:
;; 1ms--
; Delay 16 000 cycles
; 1ms at 16 MHz
    ldi  r18, 21
    ldi  r19, 199
Ldelay_ms1: dec  r19
    brne Ldelay_ms1
    dec  r18
    brne Ldelay_ms1
;; --
	sbiw r24, 1 ;; Subtract 1 from r25:r24
 	brcc delay_ms
 	ret
	
	
;; void delay_s(uint16_t seconds)
;; arguments in r25, r24
;; r24 * 0xFF * r25 * (16 000 000) cycles
.global delay_s
delay_s:
;; 1s--
; Delay 16 000 000 cycles
; 1s at 16 MHz
    ldi  r18, 82
    ldi  r19, 43
    ldi  r20, 0
Ldelay_s1: dec  r20
    brne Ldelay_s1
    dec  r19
    brne Ldelay_s1
    dec  r18
    brne Ldelay_s1
    lpm
    nop
;; --
	sbiw r24, 1 ;; Subtract 1 from r25:r24
 	brcc delay_s
 	ret

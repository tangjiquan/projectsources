################################################################################
# Automatically-generated file. Do not edit!
################################################################################

# Add inputs and outputs from these tool invocations to the build variables 
C_SRCS += \
../src/src/mail/ngx_mail.c \
../src/src/mail/ngx_mail_auth_http_module.c \
../src/src/mail/ngx_mail_core_module.c \
../src/src/mail/ngx_mail_handler.c \
../src/src/mail/ngx_mail_imap_handler.c \
../src/src/mail/ngx_mail_imap_module.c \
../src/src/mail/ngx_mail_parse.c \
../src/src/mail/ngx_mail_pop3_handler.c \
../src/src/mail/ngx_mail_pop3_module.c \
../src/src/mail/ngx_mail_proxy_module.c \
../src/src/mail/ngx_mail_smtp_handler.c \
../src/src/mail/ngx_mail_smtp_module.c \
../src/src/mail/ngx_mail_ssl_module.c 

OBJS += \
./src/src/mail/ngx_mail.o \
./src/src/mail/ngx_mail_auth_http_module.o \
./src/src/mail/ngx_mail_core_module.o \
./src/src/mail/ngx_mail_handler.o \
./src/src/mail/ngx_mail_imap_handler.o \
./src/src/mail/ngx_mail_imap_module.o \
./src/src/mail/ngx_mail_parse.o \
./src/src/mail/ngx_mail_pop3_handler.o \
./src/src/mail/ngx_mail_pop3_module.o \
./src/src/mail/ngx_mail_proxy_module.o \
./src/src/mail/ngx_mail_smtp_handler.o \
./src/src/mail/ngx_mail_smtp_module.o \
./src/src/mail/ngx_mail_ssl_module.o 

C_DEPS += \
./src/src/mail/ngx_mail.d \
./src/src/mail/ngx_mail_auth_http_module.d \
./src/src/mail/ngx_mail_core_module.d \
./src/src/mail/ngx_mail_handler.d \
./src/src/mail/ngx_mail_imap_handler.d \
./src/src/mail/ngx_mail_imap_module.d \
./src/src/mail/ngx_mail_parse.d \
./src/src/mail/ngx_mail_pop3_handler.d \
./src/src/mail/ngx_mail_pop3_module.d \
./src/src/mail/ngx_mail_proxy_module.d \
./src/src/mail/ngx_mail_smtp_handler.d \
./src/src/mail/ngx_mail_smtp_module.d \
./src/src/mail/ngx_mail_ssl_module.d 


# Each subdirectory must supply rules for building sources it contributes
src/src/mail/%.o: ../src/src/mail/%.c
	@echo 'Building file: $<'
	@echo 'Invoking: Cross GCC Compiler'
	gcc -O0 -g3 -Wall -c -fmessage-length=0 -MMD -MP -MF"$(@:%.o=%.d)" -MT"$(@:%.o=%.d)" -o "$@" "$<"
	@echo 'Finished building: $<'
	@echo ' '



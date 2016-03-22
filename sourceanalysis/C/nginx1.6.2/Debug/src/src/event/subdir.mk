################################################################################
# Automatically-generated file. Do not edit!
################################################################################

# Add inputs and outputs from these tool invocations to the build variables 
C_SRCS += \
../src/src/event/ngx_event.c \
../src/src/event/ngx_event_accept.c \
../src/src/event/ngx_event_busy_lock.c \
../src/src/event/ngx_event_connect.c \
../src/src/event/ngx_event_mutex.c \
../src/src/event/ngx_event_openssl.c \
../src/src/event/ngx_event_openssl_stapling.c \
../src/src/event/ngx_event_pipe.c \
../src/src/event/ngx_event_posted.c \
../src/src/event/ngx_event_timer.c 

OBJS += \
./src/src/event/ngx_event.o \
./src/src/event/ngx_event_accept.o \
./src/src/event/ngx_event_busy_lock.o \
./src/src/event/ngx_event_connect.o \
./src/src/event/ngx_event_mutex.o \
./src/src/event/ngx_event_openssl.o \
./src/src/event/ngx_event_openssl_stapling.o \
./src/src/event/ngx_event_pipe.o \
./src/src/event/ngx_event_posted.o \
./src/src/event/ngx_event_timer.o 

C_DEPS += \
./src/src/event/ngx_event.d \
./src/src/event/ngx_event_accept.d \
./src/src/event/ngx_event_busy_lock.d \
./src/src/event/ngx_event_connect.d \
./src/src/event/ngx_event_mutex.d \
./src/src/event/ngx_event_openssl.d \
./src/src/event/ngx_event_openssl_stapling.d \
./src/src/event/ngx_event_pipe.d \
./src/src/event/ngx_event_posted.d \
./src/src/event/ngx_event_timer.d 


# Each subdirectory must supply rules for building sources it contributes
src/src/event/%.o: ../src/src/event/%.c
	@echo 'Building file: $<'
	@echo 'Invoking: Cross GCC Compiler'
	gcc -O0 -g3 -Wall -c -fmessage-length=0 -MMD -MP -MF"$(@:%.o=%.d)" -MT"$(@:%.o=%.d)" -o "$@" "$<"
	@echo 'Finished building: $<'
	@echo ' '



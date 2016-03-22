################################################################################
# Automatically-generated file. Do not edit!
################################################################################

# Add inputs and outputs from these tool invocations to the build variables 
C_SRCS += \
../src/src/misc/ngx_google_perftools_module.c 

OBJS += \
./src/src/misc/ngx_google_perftools_module.o 

C_DEPS += \
./src/src/misc/ngx_google_perftools_module.d 


# Each subdirectory must supply rules for building sources it contributes
src/src/misc/%.o: ../src/src/misc/%.c
	@echo 'Building file: $<'
	@echo 'Invoking: Cross GCC Compiler'
	gcc -O0 -g3 -Wall -c -fmessage-length=0 -MMD -MP -MF"$(@:%.o=%.d)" -MT"$(@:%.o=%.d)" -o "$@" "$<"
	@echo 'Finished building: $<'
	@echo ' '



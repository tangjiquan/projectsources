################################################################################
# Automatically-generated file. Do not edit!
################################################################################

# Add inputs and outputs from these tool invocations to the build variables 
C_SRCS += \
../src/src/http/ngx_http.c \
../src/src/http/ngx_http_busy_lock.c \
../src/src/http/ngx_http_copy_filter_module.c \
../src/src/http/ngx_http_core_module.c \
../src/src/http/ngx_http_file_cache.c \
../src/src/http/ngx_http_header_filter_module.c \
../src/src/http/ngx_http_parse.c \
../src/src/http/ngx_http_parse_time.c \
../src/src/http/ngx_http_postpone_filter_module.c \
../src/src/http/ngx_http_request.c \
../src/src/http/ngx_http_request_body.c \
../src/src/http/ngx_http_script.c \
../src/src/http/ngx_http_spdy.c \
../src/src/http/ngx_http_spdy_filter_module.c \
../src/src/http/ngx_http_spdy_module.c \
../src/src/http/ngx_http_special_response.c \
../src/src/http/ngx_http_upstream.c \
../src/src/http/ngx_http_upstream_round_robin.c \
../src/src/http/ngx_http_variables.c \
../src/src/http/ngx_http_write_filter_module.c 

OBJS += \
./src/src/http/ngx_http.o \
./src/src/http/ngx_http_busy_lock.o \
./src/src/http/ngx_http_copy_filter_module.o \
./src/src/http/ngx_http_core_module.o \
./src/src/http/ngx_http_file_cache.o \
./src/src/http/ngx_http_header_filter_module.o \
./src/src/http/ngx_http_parse.o \
./src/src/http/ngx_http_parse_time.o \
./src/src/http/ngx_http_postpone_filter_module.o \
./src/src/http/ngx_http_request.o \
./src/src/http/ngx_http_request_body.o \
./src/src/http/ngx_http_script.o \
./src/src/http/ngx_http_spdy.o \
./src/src/http/ngx_http_spdy_filter_module.o \
./src/src/http/ngx_http_spdy_module.o \
./src/src/http/ngx_http_special_response.o \
./src/src/http/ngx_http_upstream.o \
./src/src/http/ngx_http_upstream_round_robin.o \
./src/src/http/ngx_http_variables.o \
./src/src/http/ngx_http_write_filter_module.o 

C_DEPS += \
./src/src/http/ngx_http.d \
./src/src/http/ngx_http_busy_lock.d \
./src/src/http/ngx_http_copy_filter_module.d \
./src/src/http/ngx_http_core_module.d \
./src/src/http/ngx_http_file_cache.d \
./src/src/http/ngx_http_header_filter_module.d \
./src/src/http/ngx_http_parse.d \
./src/src/http/ngx_http_parse_time.d \
./src/src/http/ngx_http_postpone_filter_module.d \
./src/src/http/ngx_http_request.d \
./src/src/http/ngx_http_request_body.d \
./src/src/http/ngx_http_script.d \
./src/src/http/ngx_http_spdy.d \
./src/src/http/ngx_http_spdy_filter_module.d \
./src/src/http/ngx_http_spdy_module.d \
./src/src/http/ngx_http_special_response.d \
./src/src/http/ngx_http_upstream.d \
./src/src/http/ngx_http_upstream_round_robin.d \
./src/src/http/ngx_http_variables.d \
./src/src/http/ngx_http_write_filter_module.d 


# Each subdirectory must supply rules for building sources it contributes
src/src/http/%.o: ../src/src/http/%.c
	@echo 'Building file: $<'
	@echo 'Invoking: Cross GCC Compiler'
	gcc -O0 -g3 -Wall -c -fmessage-length=0 -MMD -MP -MF"$(@:%.o=%.d)" -MT"$(@:%.o=%.d)" -o "$@" "$<"
	@echo 'Finished building: $<'
	@echo ' '



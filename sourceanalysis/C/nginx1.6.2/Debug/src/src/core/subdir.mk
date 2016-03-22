################################################################################
# Automatically-generated file. Do not edit!
################################################################################

# Add inputs and outputs from these tool invocations to the build variables 
C_SRCS += \
../src/src/core/nginx.c \
../src/src/core/ngx_array.c \
../src/src/core/ngx_buf.c \
../src/src/core/ngx_conf_file.c \
../src/src/core/ngx_connection.c \
../src/src/core/ngx_cpuinfo.c \
../src/src/core/ngx_crc32.c \
../src/src/core/ngx_crypt.c \
../src/src/core/ngx_cycle.c \
../src/src/core/ngx_file.c \
../src/src/core/ngx_hash.c \
../src/src/core/ngx_inet.c \
../src/src/core/ngx_list.c \
../src/src/core/ngx_log.c \
../src/src/core/ngx_md5.c \
../src/src/core/ngx_murmurhash.c \
../src/src/core/ngx_open_file_cache.c \
../src/src/core/ngx_output_chain.c \
../src/src/core/ngx_palloc.c \
../src/src/core/ngx_parse.c \
../src/src/core/ngx_proxy_protocol.c \
../src/src/core/ngx_queue.c \
../src/src/core/ngx_radix_tree.c \
../src/src/core/ngx_rbtree.c \
../src/src/core/ngx_regex.c \
../src/src/core/ngx_resolver.c \
../src/src/core/ngx_shmtx.c \
../src/src/core/ngx_slab.c \
../src/src/core/ngx_spinlock.c \
../src/src/core/ngx_string.c \
../src/src/core/ngx_times.c 

OBJS += \
./src/src/core/nginx.o \
./src/src/core/ngx_array.o \
./src/src/core/ngx_buf.o \
./src/src/core/ngx_conf_file.o \
./src/src/core/ngx_connection.o \
./src/src/core/ngx_cpuinfo.o \
./src/src/core/ngx_crc32.o \
./src/src/core/ngx_crypt.o \
./src/src/core/ngx_cycle.o \
./src/src/core/ngx_file.o \
./src/src/core/ngx_hash.o \
./src/src/core/ngx_inet.o \
./src/src/core/ngx_list.o \
./src/src/core/ngx_log.o \
./src/src/core/ngx_md5.o \
./src/src/core/ngx_murmurhash.o \
./src/src/core/ngx_open_file_cache.o \
./src/src/core/ngx_output_chain.o \
./src/src/core/ngx_palloc.o \
./src/src/core/ngx_parse.o \
./src/src/core/ngx_proxy_protocol.o \
./src/src/core/ngx_queue.o \
./src/src/core/ngx_radix_tree.o \
./src/src/core/ngx_rbtree.o \
./src/src/core/ngx_regex.o \
./src/src/core/ngx_resolver.o \
./src/src/core/ngx_shmtx.o \
./src/src/core/ngx_slab.o \
./src/src/core/ngx_spinlock.o \
./src/src/core/ngx_string.o \
./src/src/core/ngx_times.o 

C_DEPS += \
./src/src/core/nginx.d \
./src/src/core/ngx_array.d \
./src/src/core/ngx_buf.d \
./src/src/core/ngx_conf_file.d \
./src/src/core/ngx_connection.d \
./src/src/core/ngx_cpuinfo.d \
./src/src/core/ngx_crc32.d \
./src/src/core/ngx_crypt.d \
./src/src/core/ngx_cycle.d \
./src/src/core/ngx_file.d \
./src/src/core/ngx_hash.d \
./src/src/core/ngx_inet.d \
./src/src/core/ngx_list.d \
./src/src/core/ngx_log.d \
./src/src/core/ngx_md5.d \
./src/src/core/ngx_murmurhash.d \
./src/src/core/ngx_open_file_cache.d \
./src/src/core/ngx_output_chain.d \
./src/src/core/ngx_palloc.d \
./src/src/core/ngx_parse.d \
./src/src/core/ngx_proxy_protocol.d \
./src/src/core/ngx_queue.d \
./src/src/core/ngx_radix_tree.d \
./src/src/core/ngx_rbtree.d \
./src/src/core/ngx_regex.d \
./src/src/core/ngx_resolver.d \
./src/src/core/ngx_shmtx.d \
./src/src/core/ngx_slab.d \
./src/src/core/ngx_spinlock.d \
./src/src/core/ngx_string.d \
./src/src/core/ngx_times.d 


# Each subdirectory must supply rules for building sources it contributes
src/src/core/%.o: ../src/src/core/%.c
	@echo 'Building file: $<'
	@echo 'Invoking: Cross GCC Compiler'
	gcc -O0 -g3 -Wall -c -fmessage-length=0 -MMD -MP -MF"$(@:%.o=%.d)" -MT"$(@:%.o=%.d)" -o "$@" "$<"
	@echo 'Finished building: $<'
	@echo ' '



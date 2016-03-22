################################################################################
# Automatically-generated file. Do not edit!
################################################################################

# Add inputs and outputs from these tool invocations to the build variables 
C_SRCS += \
../src/src/os/unix/ngx_aio_read.c \
../src/src/os/unix/ngx_aio_read_chain.c \
../src/src/os/unix/ngx_aio_write.c \
../src/src/os/unix/ngx_aio_write_chain.c \
../src/src/os/unix/ngx_alloc.c \
../src/src/os/unix/ngx_channel.c \
../src/src/os/unix/ngx_daemon.c \
../src/src/os/unix/ngx_darwin_init.c \
../src/src/os/unix/ngx_darwin_sendfile_chain.c \
../src/src/os/unix/ngx_errno.c \
../src/src/os/unix/ngx_file_aio_read.c \
../src/src/os/unix/ngx_files.c \
../src/src/os/unix/ngx_freebsd_init.c \
../src/src/os/unix/ngx_freebsd_rfork_thread.c \
../src/src/os/unix/ngx_freebsd_sendfile_chain.c \
../src/src/os/unix/ngx_linux_aio_read.c \
../src/src/os/unix/ngx_linux_init.c \
../src/src/os/unix/ngx_linux_sendfile_chain.c \
../src/src/os/unix/ngx_posix_init.c \
../src/src/os/unix/ngx_process.c \
../src/src/os/unix/ngx_process_cycle.c \
../src/src/os/unix/ngx_pthread_thread.c \
../src/src/os/unix/ngx_readv_chain.c \
../src/src/os/unix/ngx_recv.c \
../src/src/os/unix/ngx_send.c \
../src/src/os/unix/ngx_setaffinity.c \
../src/src/os/unix/ngx_setproctitle.c \
../src/src/os/unix/ngx_shmem.c \
../src/src/os/unix/ngx_socket.c \
../src/src/os/unix/ngx_solaris_init.c \
../src/src/os/unix/ngx_solaris_sendfilev_chain.c \
../src/src/os/unix/ngx_time.c \
../src/src/os/unix/ngx_udp_recv.c \
../src/src/os/unix/ngx_user.c \
../src/src/os/unix/ngx_writev_chain.c 

S_UPPER_SRCS += \
../src/src/os/unix/rfork_thread.S 

OBJS += \
./src/src/os/unix/ngx_aio_read.o \
./src/src/os/unix/ngx_aio_read_chain.o \
./src/src/os/unix/ngx_aio_write.o \
./src/src/os/unix/ngx_aio_write_chain.o \
./src/src/os/unix/ngx_alloc.o \
./src/src/os/unix/ngx_channel.o \
./src/src/os/unix/ngx_daemon.o \
./src/src/os/unix/ngx_darwin_init.o \
./src/src/os/unix/ngx_darwin_sendfile_chain.o \
./src/src/os/unix/ngx_errno.o \
./src/src/os/unix/ngx_file_aio_read.o \
./src/src/os/unix/ngx_files.o \
./src/src/os/unix/ngx_freebsd_init.o \
./src/src/os/unix/ngx_freebsd_rfork_thread.o \
./src/src/os/unix/ngx_freebsd_sendfile_chain.o \
./src/src/os/unix/ngx_linux_aio_read.o \
./src/src/os/unix/ngx_linux_init.o \
./src/src/os/unix/ngx_linux_sendfile_chain.o \
./src/src/os/unix/ngx_posix_init.o \
./src/src/os/unix/ngx_process.o \
./src/src/os/unix/ngx_process_cycle.o \
./src/src/os/unix/ngx_pthread_thread.o \
./src/src/os/unix/ngx_readv_chain.o \
./src/src/os/unix/ngx_recv.o \
./src/src/os/unix/ngx_send.o \
./src/src/os/unix/ngx_setaffinity.o \
./src/src/os/unix/ngx_setproctitle.o \
./src/src/os/unix/ngx_shmem.o \
./src/src/os/unix/ngx_socket.o \
./src/src/os/unix/ngx_solaris_init.o \
./src/src/os/unix/ngx_solaris_sendfilev_chain.o \
./src/src/os/unix/ngx_time.o \
./src/src/os/unix/ngx_udp_recv.o \
./src/src/os/unix/ngx_user.o \
./src/src/os/unix/ngx_writev_chain.o \
./src/src/os/unix/rfork_thread.o 

C_DEPS += \
./src/src/os/unix/ngx_aio_read.d \
./src/src/os/unix/ngx_aio_read_chain.d \
./src/src/os/unix/ngx_aio_write.d \
./src/src/os/unix/ngx_aio_write_chain.d \
./src/src/os/unix/ngx_alloc.d \
./src/src/os/unix/ngx_channel.d \
./src/src/os/unix/ngx_daemon.d \
./src/src/os/unix/ngx_darwin_init.d \
./src/src/os/unix/ngx_darwin_sendfile_chain.d \
./src/src/os/unix/ngx_errno.d \
./src/src/os/unix/ngx_file_aio_read.d \
./src/src/os/unix/ngx_files.d \
./src/src/os/unix/ngx_freebsd_init.d \
./src/src/os/unix/ngx_freebsd_rfork_thread.d \
./src/src/os/unix/ngx_freebsd_sendfile_chain.d \
./src/src/os/unix/ngx_linux_aio_read.d \
./src/src/os/unix/ngx_linux_init.d \
./src/src/os/unix/ngx_linux_sendfile_chain.d \
./src/src/os/unix/ngx_posix_init.d \
./src/src/os/unix/ngx_process.d \
./src/src/os/unix/ngx_process_cycle.d \
./src/src/os/unix/ngx_pthread_thread.d \
./src/src/os/unix/ngx_readv_chain.d \
./src/src/os/unix/ngx_recv.d \
./src/src/os/unix/ngx_send.d \
./src/src/os/unix/ngx_setaffinity.d \
./src/src/os/unix/ngx_setproctitle.d \
./src/src/os/unix/ngx_shmem.d \
./src/src/os/unix/ngx_socket.d \
./src/src/os/unix/ngx_solaris_init.d \
./src/src/os/unix/ngx_solaris_sendfilev_chain.d \
./src/src/os/unix/ngx_time.d \
./src/src/os/unix/ngx_udp_recv.d \
./src/src/os/unix/ngx_user.d \
./src/src/os/unix/ngx_writev_chain.d 


# Each subdirectory must supply rules for building sources it contributes
src/src/os/unix/%.o: ../src/src/os/unix/%.c
	@echo 'Building file: $<'
	@echo 'Invoking: Cross GCC Compiler'
	gcc -O0 -g3 -Wall -c -fmessage-length=0 -MMD -MP -MF"$(@:%.o=%.d)" -MT"$(@:%.o=%.d)" -o "$@" "$<"
	@echo 'Finished building: $<'
	@echo ' '

src/src/os/unix/%.o: ../src/src/os/unix/%.S
	@echo 'Building file: $<'
	@echo 'Invoking: Cross GCC Assembler'
	as  -o "$@" "$<"
	@echo 'Finished building: $<'
	@echo ' '



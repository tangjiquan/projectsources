################################################################################
# Automatically-generated file. Do not edit!
################################################################################

-include ../makefile.init

RM := rm -rf

# All of the sources participating in the build are defined here
-include sources.mk
-include src/src/os/unix/subdir.mk
-include src/src/misc/subdir.mk
-include src/src/mail/subdir.mk
-include src/src/http/modules/perl/subdir.mk
-include src/src/http/modules/subdir.mk
-include src/src/http/subdir.mk
-include src/src/event/modules/subdir.mk
-include src/src/event/subdir.mk
-include src/src/core/subdir.mk
-include src/subdir.mk
-include subdir.mk
-include objects.mk

ifneq ($(MAKECMDGOALS),clean)
ifneq ($(strip $(C_DEPS)),)
-include $(C_DEPS)
endif
endif

-include ../makefile.defs

# Add inputs and outputs from these tool invocations to the build variables 

# All Target
all: nginx1.6.2

# Tool invocations
nginx1.6.2: $(OBJS) $(USER_OBJS)
	@echo 'Building target: $@'
	@echo 'Invoking: Cross GCC Linker'
	gcc  -o "nginx1.6.2" $(OBJS) $(USER_OBJS) $(LIBS)
	@echo 'Finished building target: $@'
	@echo ' '

# Other Targets
clean:
	-$(RM) $(EXECUTABLES)$(OBJS)$(C_DEPS) nginx1.6.2
	-@echo ' '

.PHONY: all clean dependents
.SECONDARY:

-include ../makefile.targets

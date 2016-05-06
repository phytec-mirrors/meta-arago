DESCRIPTION = "Task to install sources for additional utilities/demos for SDKs"
LICENSE = "MIT"
PR = "r26"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

UTILS = " \
    am-sysinfo-src \
    arm-benchmarks-src \
    oprofile-example-src \
"

# Add pru and profibus sources for omapl138 devices
UTILS_append_am180x-evm = " \
    ti-pru-sw-examples-src \
"

UTILS_append_omap-a15 = " \
    omapconf-src \
    pru-icss-src \
"

UTILS_append_ti33x = " \
    omapconf-src \
    pru-icss-src \
"

UTILS_append_ti43x = " \
    pru-icss-src \
"

UTILS_append_dra7xx = " \
    opencl-examples-src \
    openmpacc-examples-src \
"

UTILS_append_k2hk-evm = " \
    opencl-examples-src \
    openmpacc-examples-src \
    linalg-examples-src \
"

UTILS_append_k2l-evm = " \
    opencl-examples-src \
    openmpacc-examples-src \
"

UTILS_append_k2e-evm = " \
    opencl-examples-src \
    openmpacc-examples-src \
"

EXTRA_LIBS = ""

EXTRA_LIBS_append_omap-a15 = " \
    cmem-mod-src \
    pru-icss-src \
"

EXTRA_LIBS_append_dra7xx = " \
    debugss-module-drv-src \
    gdbserverproxy-module-drv-src \
"

#    ipsecmgr-mod-src
EXTRA_LIBS_append_keystone = " \
    cmem-mod-src \
    uio-module-drv-src \
    hplib-mod-src \
"

EXTRA_LIBS_append_k2hk-evm = " \
    debugss-module-drv-src \
    gdbserverproxy-module-drv-src \
"

EXTRA_LIBS_append_k2l-evm = " \
    debugss-module-drv-src \
    gdbserverproxy-module-drv-src \
"

EXTRA_LIBS_append_k2e-evm = " \
    debugss-module-drv-src \
    gdbserverproxy-module-drv-src \
"

RDEPENDS_${PN} = "\
    ${UTILS} \
    ${EXTRA_LIBS} \
"

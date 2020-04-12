SUMMARY = "Task to add multimedia related sources into the SDK"
LICENSE = "MIT"
PR = "r15"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

BARCODE_PKG = "${@bb.utils.contains('MACHINE_FEATURES', 'dsp', 'barcode-roi-src', '', d)}"

MULTIMEDIA = ""

MULTIMEDIA_append_ti33x = " ${BARCODE_PKG}"

MULTIMEDIA_append_ti43x = " \
    dual-camera-demo-src \
    image-gallery-src \
    ${BARCODE_PKG} \
"

MULTIMEDIA_append_omap-a15 = " \
    dual-camera-demo-src \
    image-gallery-src \
    ${BARCODE_PKG} \
"

MULTIMEDIA_append_am65xx = " ${BARCODE_PKG}"

MULTIMEDIA_append_dra7xx = " \
    ${@['','qt-opencv-opencl-opengl-multithreaded-src'][oe.utils.all_distro_features(d, 'opencv opencl opengl', True, False) and bb.utils.contains('MACHINE_FEATURES', 'gpu dsp', True, False, d)]} \
"

MULTIMEDIA_append_keystone = " ${BARCODE_PKG}"

RDEPENDS_${PN} = "\
    ${MULTIMEDIA} \
"

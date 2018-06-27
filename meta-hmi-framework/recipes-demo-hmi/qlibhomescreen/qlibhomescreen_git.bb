SUMMARY     = "A wrapper library of libhomescreen for Qt Application in AGL"
SECTION     = "libs"
LICENSE     = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2ee41112a44fe7014dce33e26468ba93"

DEPENDS = "qtbase libhomescreen-2017"
RDEPENDS_${PN} = "libhomescreen-2017"

inherit qmake5

SRC_URI = "git://gerrit.automotivelinux.org/gerrit/staging/qlibhomescreen.git;protocol=https;branch=${AGL_BRANCH}"
SRCREV = "c13e74075bff59ad67fca9fbface5075ec70f115"
S = "${WORKDIR}/git"

SUMMARY     = "A wrapper library of libwindowmanager for Qt Application in AGL"
SECTION     = "graphics"
LICENSE     = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2ee41112a44fe7014dce33e26468ba93"

DEPENDS = "qtbase libwindowmanager"
RDEPENDS_${PN} = "libwindowmanager"

inherit qmake5

SRC_URI = "git://gerrit.automotivelinux.org/gerrit/src/libqtwindowmanager.git;protocol=https;branch=sandbox/ruke47/flounder_RPi3"
SRCREV = "${AUTOREV}"
S = "${WORKDIR}/git"
PV = "1.0+git${SRCPV}"

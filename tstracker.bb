DESCRIPTION = "Touchscreen event tracking app for debugging Qt touchscreen"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/BSD-3-Clause;md5=550794465ba0ec5312d6919e203a55f9"

inherit qt4e

SRCREV = "${AUTOREV}"

SRC_URI = "git://github.com/Pansenti/tstracker.git;protocol=git"

S = "${WORKDIR}/git"

do_install() {
	export INSTALL_ROOT=${D}
	make install
}


SUMMARY = "OpenCPI Runtime"
HOMEPAGE = "https://opencpi.github.io"
SECTION = "core"
LICENSE = "CLOSED"

SRC_URI = "file://${MACHINE}"

RDPENDS_${PN} += "bash"

FILES_${PN} = "${ROOT_HOME}"

INSANE_SKIP_${PN} += "file-rdeps"

S = "${WORKDIR}"

COMPATIBLE_MACHINE = "^$"
COMPATIBLE_MACHINE_zcu102-zynqmp = "zcu102-zynqmp"
COMPATIBLE_MACHINE_zcu111-zynqmp = "zcu111-zynqmp"

PACKAGE_ARCH ?= "${MACHINE_ARCH}"

do_configure[noexec] = "1"
do_compile[noexec] = "1"

fakeroot do_install () {
    install -d 0755 ${D}${ROOT_HOME}/opencpi
    cp -ar ${S}/${MACHINE}/opencpi/* ${D}${ROOT_HOME}/opencpi/
}

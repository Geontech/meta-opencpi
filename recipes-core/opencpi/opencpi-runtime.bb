SUMMARY = "OpenCPI Runtime"
HOMEPAGE = "https://opencpi.github.io"
SECTION = "core"
LICENSE = "CLOSED"

SRC_URI = "file://${MACHINE}"

RDPENDS_${PN} += "bash glibc"

FILES_${PN} = "${ROOT_HOME}"

INSANE_SKIP_${PN} += "file-rdeps"

S = "${WORKDIR}"

COMPATIBLE_MACHINE = "^$"
COMPATIBLE_MACHINE_zcu102-zynqmp = "zcu102-zynqmp"
COMPATIBLE_MACHINE_zcu111-zynqmp = "zcu111-zynqmp"

PACKAGE_ARCH ?= "${MACHINE_ARCH}"

# The following INHIBITs are needed to prevent OpenCPI worker SO files from being stripped of content.
# It seems that without these set, the worker SO files lose their metadata, and OpenCPI has no way
# of knowing that they are valid OpenCPI workers and what parameters each worker was built with. This
# problem matierializes during ocpirun's artifact searching.
INHIBIT_PACKAGE_STRIP = "1"
INHIBIT_PACKAGE_DEBUG_SPLIT = "1"

do_configure[noexec] = "1"
do_compile[noexec] = "1"

# Copy OpenCPI SD card contents over to /home/root. These come from OpenCPI's CDK.
fakeroot do_install () {
    install -d 0755 ${D}${ROOT_HOME}/opencpi
    cp -ar ${S}/${MACHINE}/opencpi/* ${D}${ROOT_HOME}/opencpi/
}

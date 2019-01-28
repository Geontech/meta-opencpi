FILESEXTRAPATHS_prepend := "${THISDIR}/linux-xlnx/v2018.2:"

SRC_URI_append_zynqmp = " file://zynqmp-disable-cpu-idle.cfg"


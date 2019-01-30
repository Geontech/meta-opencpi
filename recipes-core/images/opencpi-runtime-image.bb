inherit core-image

SUMMARY = "OpenCPI Base Image"

IMAGE_INSTALL_append = "\
    opencpi-runtime \
"

# Will default to IMAGE_NAME.wks
IMAGE_FSTYPES = "wic wic.xz"
IMAGE_FSTYPES_qemuarm64 = "ext4"

WKS_FILES = "opencpi-runtime-image.wks"

IMAGE_FEATURES += "\
    ssh-server-openssh \
    "
# GDB is hugely helpful in OpenCPI development
EXTRA_IMAGE_FEATURES += "tools-debug"

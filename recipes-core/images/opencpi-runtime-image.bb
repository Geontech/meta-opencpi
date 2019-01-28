inherit core-image

SUMMARY = "OpenCPI Base Image"

IMAGE_INSTALL_append = "\
    opencpi-runtime \
"

# Will default to IMAGE_NAME.wks
IMAGE_FSTYPES = "wic wic.xz"
IMAGE_FSTYPES_qemuarm64 = "ext4"

IMAGE_FEATURES += "\
    ssh-server-openssh \
    "

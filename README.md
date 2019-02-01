# OpenCPI Layer

This layer provides the following images:

| Name | Purpose |
| ------ | ------ |
| `opencpi-runtime-image` | Base OpenCPI Runtime |

The `opencpi-runtime-image` installs `opencpi-runtime` which is only compatible with the following machines:

 * `zcu102-zynqmp`
 * `zcu111-zynqmp`

In order to ensure OpenCPI's SD card contents are placed on the SD card (in /home/root/opencpi/), copy the
SD card contents from OpenCPI CDK. Assuming the OCPI_CDK_DIR is set and OpenCPI's SD card contents are present for the ZCU102/ZCU111:

* For the ZCU102:
cp -rf $OCPI_CDK_DIR/zcu102/sdcard-xilinx18_2/opencpi recipes-core/opencpi/opencpi-runtime/zcu102-zynqmp/;

* For the ZCU111:
cp -rf $OCPI_CDK_DIR/zcu111/sdcard-xilinx18_2/opencpi recipes-core/opencpi/opencpi-runtime/zcu111-zynqmp/;

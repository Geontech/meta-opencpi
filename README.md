# OpenCPI Layer

This layer provides the following images:

| Name | Purpose |
| ------ | ------ |
| `opencpi-runtime-image` | Base OpenCPI Runtime |

The `opencpi-runtime-image` installs `opencpi-runtime` which is only compatible with the following machines:

 * `stratix10`

In order to ensure OpenCPI's SD card contents are placed on the SD card (in /home/root/opencpi/), copy the
SD card contents from OpenCPI CDK. Assuming the OCPI_CDK_DIR is set and OpenCPI's SD card contents are present for the Stratix10 SX SoC Dev Kit:

* For the Stratix10:
```
cp -rf $OCPI_CDK_DIR/dk_soc_1ssx_l_a/dk_soc_1ssx_l_a-deploy/sdcard-s10sx/opencpi/ recipes-core/opencpi/opencpi-runtime/stratix10/;
```

```

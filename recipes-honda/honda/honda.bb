#
# This file was derived from the 'Hello World!' example recipe in the
# Yocto Project Development Manual.
#

DESCRIPTION = "Honda Svelte application"

FILESEXTRAPATHS:prepend := "${THISDIR}:"
SRC_URI += " file://public.tar.gz"
FILES_${PN} += " ${localstatedir}/*"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

do_install() {
  # Propagate build result into the package
  SRC=${WORKDIR}/public/*
  DST=${D}${localstatedir}/www/kratos
  install -d --mode 755 $DST
  cp -r $SRC $DST
}

DESCRIPTION = "P7 Honda Loader"
LICENSE = "CLOSED"

RDEPENDS:${PN}-dev = "bash"
RDEPENDS:${PN} += " bash"

FILEEXTRAPATHS:prepend = "${THISDIR}/${PN}:"

SRC_URI:append = "\
  file://loader.sh\
  file://failed.html\
  file://update.html\
  file://updated.html"

FILES:${PN} += "\
  ${bindir}\
  ${libdir}"

do_install:append() {
  install -d --mode 755 ${D}${bindir}
  install -d --mode 755 ${D}${libdir}
  install -m 0644 ${WORKDIR}/loader.sh ${D}${bindir}
  install -m 0644 ${WORKDIR}/*.html ${D}${libdir}
  chmod +x ${D}${bindir}/loader.sh
}

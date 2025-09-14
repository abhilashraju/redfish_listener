SUMMARY = "Redfish Listener"
DESCRIPTION = "Redfish Listener"
HOMEPAGE = "https://github.com/abhilashraju/redfish_listener"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=cca3a276950ee5cf565f9a7fc281c482"
DEPENDS = " \
    boost \
    systemd \
    nlohmann-json \
    sdeventplus \
    coroserver"

SRC_URI = "git://github.com/abhilashraju/redfishlistener.git;branch=main;protocol=https"
SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"

inherit systemd
inherit pkgconfig meson

EXTRA_OEMESON = " \
    --buildtype=minsize \
"

# Specify the source directory
S = "${WORKDIR}/git"

# Specify the installation directory
bindir = "/usr/bin"
FILES:${PN} += "/usr/bin/redfishlistener"


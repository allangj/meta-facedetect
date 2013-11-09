SUMMARY = "Face detection app"
DESCRIPTION = "Face detection app usign OpenCV on an input image"
HOMEPAGE = "https://github.com/allangj/facedetect"
AUTHOR = "Allan Granados Jiménez"
SECTION = "bin"

LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://${WORKDIR}/git/README.md;md5=f5c98e294db0d5c0c0dad2935ebe1528"

DEPENDS = "opencv"

inherit pkgconfig

BRANCH = "master"

SRCREV = "b034fb58d8ea71c2820626244c396cedf641e279"
SRC_URI = "git://github.com/allangj/facedetect.git;branch=${BRANCH}"

S = "${WORKDIR}/git/"
D = ""

EXTRA_OEMAKE = " -C ${S}"

do_compile() {
}

do_install () {
   oe_runmake install INSTALL_PREFIX=${D} -C ${S}
}

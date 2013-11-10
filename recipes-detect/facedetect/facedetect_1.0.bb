SUMMARY = "Face detection app"
DESCRIPTION = "Face detection app usign OpenCV on an input image"
HOMEPAGE = "https://github.com/allangj/facedetect"
AUTHOR = "Allan Granados Jiménez"
SECTION = "bin"

LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://${WORKDIR}/git/README.md;md5=f5c98e294db0d5c0c0dad2935ebe1528"

DEPENDS = "opencv"

inherit pkgconfig cmake

BRANCH = "master"

SRCREV = "1d15c2cb6c5dbbb657016bf828d4c89a98b1bc5e"
SRC_URI = "git://github.com/allangj/facedetect.git;branch=${BRANCH}"

S = "${WORKDIR}/git"

OBJECT = "facedetect"

do_install () {
   install -d ${D}${bindir}
   install -m 0755 ${OBJECT} ${D}${bindir}
}


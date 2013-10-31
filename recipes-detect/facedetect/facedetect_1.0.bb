SUMMARY = "Face detection app"
DESCRIPTION = "Face detection app usign OpenCV on an input image"
HOMEPAGE = "https://github.com/allangj/facedetect"
AUTHOR = "Allan Granados Jiménez"
SECTION = "bin"

ARM_INSTRUCTION_SET = "arm"

DEPENDS = "opencv"

SRC_URI = "git://git@github.com:allangj/facedetect.git"

S = "${WORKDIR}/git"

do_install () {
   oe_runmake install INSTALL_PREFIX=${D}
}

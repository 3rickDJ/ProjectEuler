package p8
class UtilReader {
    static String getDigits(fileName, baseDir){
        new File(baseDir, fileName).collect{it}
    }
}

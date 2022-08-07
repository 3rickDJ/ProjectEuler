package p8
class UtilReader {
    static String getDigits( fileName, baseDir ){
        def reading = new File(baseDir, fileName).collect{it}.join('')
    }
}

package Strings.exercises

fun main(args: Array<String>) {
    var text = """
        M@t0łek r@z zwiedz@ł z00
        I w0ł@ł c0 chwil@: "0-0!"
        "J@k@ brzydk@ p@pug@!"
        "Żyr@f@ jest z@ dług@!"
        "Sł0ń z@ wys0ki!"
        "A p0 c0 k0mu te f0ki?"
        "Zebr@ m@ f@rb0w@ne żebr@!"
        "Tygrys
        Chętnie by mnie stąd wygryzł!"
        "N@, @ z@jrzyjmy p0d d@szek:
        Żółw - tuś, br@tku, tuś!"
        "A t0? Pt@szek.
        Niezły pt@szek -
        Struś!"
        Wreszcie zbliż@ się d0 wielbłąd@,
        Uw@żnie mu się przygląd@
        I p0wi@d@ wsk@zując n@ nieg0 przez kr@ty:
        "0wszem, niezły. Niczeg0! Szk0d@ tylk0, że g@rb@ty!"
    """.trimIndent()

    for (element in text) {
    if (element == '@')
        text = text.replace('@', 'a')
    else if (element == '0')
        text = text.replace('0', 'o')
    }
    println(text)
}
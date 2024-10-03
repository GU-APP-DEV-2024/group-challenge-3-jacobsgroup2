package memorygame

class Board( ) {
    //Constructor to create board of different sizes.
    // Assign

    private var cards: Array<Card> = Array<Card>(6) {_ -> Card(' ', "")}
    private val deck: Array<Card> = arrayOf<Card> (
        Card('c', "a"),
        Card('h', "10"),
        Card('d', "3")
    )

    init{
        for(i in 0.. 2) {
            cards[2*i] = deck.random()
            cards[(2*i)+1] = cards[2*i]



           // var choseCard = deck.random()
           // var index =
           // cards[i] = choseCard
        }
        cards.shuffle()



    }

    fun getValueAt(index:Int): Card {
        return cards[index]
    }


    data class Card(val suit: Char, val rank: String) {

    }
}
package memorygame

class Board( ) {
    //Constructor to create board of different sizes.
    // Assign

    private var suits = arrayOf<Char>('c', 'd', 'h', 's')
    private val rank = arrayOf<String>("2", "3", "4", "5", "6", "7", "8", "9", "10", "j", "q", "k", "a")

    private var cards: Array<Card> = Array<Card>(6) {_ -> Card(' ', "")}

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
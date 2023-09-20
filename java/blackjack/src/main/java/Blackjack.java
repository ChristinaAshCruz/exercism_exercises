public class Blackjack {

    // all cards are represented via string
    // aces = 11

    // options during first turn of game:
    // - Stand (S)
    // - Hit (H)
    // - Split (P)
    // - Automatically win (W)

    public int parseCard(String card) {
        int val;

        // initiate a switch case for each possible card value
        switch (card) {
            case "ace":
                val = 11;
                break;
            case "two":
                val = 2;
                break;
            case "three":
                val = 3;
                break;
            case "four":
                val = 4;
                break;
            case "five":
                val = 5;
                break;
            case "six":
                val = 6;
                break;
            case "seven":
                val = 7;
                break;
            case "eight":
                val = 8;
                break;
            case "nine":
                val = 9;
                break;
            // check whether card equates to ten, jack, queen, OR king
            case "ten", "jack", "queen", "king":
                val = 10;
                break;
            // if card is not equal to any of the values above, return val as 0
            default:
                val = 0;
                break;
        }
        return val;
    }

    public boolean isBlackjack(String card1, String card2) {
        // use parseCard to return a value for both card1 and card2
        int card1Value = parseCard(card1);
        int card2Value = parseCard(card2);

        int total = card1Value + card2Value;

        return (total == 21) ? true : false;
    }

    public String largeHand(boolean isBlackjack, int dealerScore) {
        // LARGE HAND
        // if 2 aces ---> always split them

        // if you have a blacjack (2 cards that = 21) AND dealer DOES NOT have an ace,
        // figure, or 10 ----> AUTOMATIC WIN
        if (isBlackjack && dealerScore < 10) {
            return "W";
            // if the dealer does have 1 of those cards ---> you have to stand and wait for
            // reveal of other card
        } else if (isBlackjack && dealerScore >= 10) {
            return "S";
        } else {
            // if all fail, return P (split)
            return "P";
        }
    }

    public String smallHand(int handScore, int dealerScore) {
        // if hand is 2 aces, split
        if (handScore == 22) {
            return "P";
            // if your cards sum up to 17+ ---> always stand
        } else if (handScore >= 17) {
            return "S";
            // if you cards sum up between 12-16 ---> always stand
        } else if (handScore >= 12 && handScore <= 16) {
            // UNLESS dealer has a 7+ card ----> if so, always hit
            if (dealerScore >= 7) {
                return "H";
            } else {
                return "S";
            }
            // if your cards sum up to 11 or lower ---> always hit
        } else {
            return "H";
        }
    }

    public String firstTurn(String card1, String card2, String dealerCard) {
        int handScore = parseCard(card1) + parseCard(card2);
        int dealerScore = parseCard(dealerCard);

        if (20 < handScore) {
            return largeHand(isBlackjack(card1, card2), dealerScore);
        } else {
            return smallHand(handScore, dealerScore);
        }
    }
}

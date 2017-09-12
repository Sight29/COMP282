import java.util.List;

public class ActualPokerHand implements Comparable<ActualPokerHand>
{
  /**
   * This is an actual poker hand that can be made from the eight available cards.
  */
  private PokerHandEnum pokerHandEnum;

  /**
   * This is the list of winning cards from the ActualPokerHand.
   */
  private List<Card> winningCards;

  private List<Card> pokerHand;

  public ActualPokerHand(PokerHandEnum pokerHand, List<Card> cards)
  {
    this.pokerHandEnum = pokerHand;
    this.winningCards = cards;
  }

  /**
   * Return The Enumerated type that represents both the poker hand and
   * the strength of the poker hand
   */
  public PokerHandEnum getPokerHandEnum()
  {
    return pokerHandEnum;
  }

  public void setPokerHandEnum(PokerHandEnum pokerHandEnum)
  {
    this.pokerHandEnum = pokerHandEnum;
  }

  public List<Card> getWinningCards()
  {
    return winningCards;
  }

  public void setWinningCards(List<Card> winningCards)
  {
    this.winningCards = winningCards;
  }

  /**
   * Return the six cards that make up this particular poker hand
   */
  public List<Card> getPokerHand()
  {
    return pokerHand;
  }

  public void setPokerHand(List<Card> pokerHand)
  {
    this.pokerHand = pokerHand;
  }

  @Override
  public int compareTo(ActualPokerHand o)
  {
    return ((Integer)this.pokerHandEnum.getStrength()).compareTo(o.getPokerHandEnum().getStrength());
  }

}

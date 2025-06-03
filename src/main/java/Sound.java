import java.util.*;
public class Sound{
  /** the array of values in this sound; guaranteed not to be null */
  int[] samples;



  /** Changes those values in this sound that have an amplitude greater than limit.
   *  Values greater than limit are changed to limit.
   *  Values less than -limit are changed to -limit.
   *  @param limit the amplitude limit
   *         Precondition: limit >= 0
   *  @return the number of values in this sound that this method changed
   */
  public int limitAmplitude(int limit){  
    /* to be implemented in part (a) */
  digitList = new ArrayList<Integer>();
    if (num == 0)
      digitList.add(new Integer(0));
    while  (num > 0){
      digitList.add(0, new Integer(num % 10));
      num /= 10;
    }
  }



  /** Removes all silence from the beginning of this sound.
   *  Silence is represented by a value of 0.
   *  Precondition: samples contains at least one nonzero value
   *  Postcondition: the length of samples reflects the removal of starting silence
   */
  public void trimSilenceFromBeginning() {
    /* to be implemented in part (b) */
    for (int i = 0; i < digitList.size()-1; i++)
      if (digitList.get(i).intValue() >= digitList.get(i+1).intValue())
        return false;
    return true
}

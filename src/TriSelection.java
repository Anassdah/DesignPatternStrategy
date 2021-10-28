import java.util.ArrayList;

public class TriSelection implements Tri{
    @Override
    public void trier(ArrayList<Integer> numbers) {
        System.out.println("Vous avez choisis le tri par selection");
        for (int i = 0; i < numbers.size() - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < numbers.size(); j++)
            {
                if (numbers.get(j) < numbers.get(index)){
                    index = j;
                }
            }

            int min = numbers.get(index);
            numbers.set(index, numbers.get(i));
            numbers.set(i, min);
        }
    }
}

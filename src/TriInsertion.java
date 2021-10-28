import java.util.ArrayList;

public class TriInsertion implements Tri{
    @Override
    public void trier(ArrayList<Integer> numbers) {
        System.out.println("Vous avez choisis le tri par insertion");
        int taille = numbers.size();

        for (int i = 1; i < taille; i++)
        {
            int index = numbers.get(i);
            int j = i-1;

            while(j >= 0 && numbers.get(j) > index)
            {
                numbers.set(j + 1, numbers.get(j));
                j--;
            }
            numbers.set(j + 1, index);
        }
    }
}

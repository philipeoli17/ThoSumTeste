import java.util.HashMap;

public class TwoSumSolution {

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> mapa = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complemento = target - nums[i];
            if (mapa.containsKey(complemento)) {
                return new int[] { mapa.get(complemento), i };
            }
            mapa.put(nums[i], i);
        }

        // Exceção para segurança
        throw new IllegalArgumentException("Nenhuma solução encontrada");
    }

    public static void main(String[] args) {
        int[] nums = {3,3};
        int target = 6;

        int[] resultado = twoSum(nums, target);
        System.out.println("Índices: [" + resultado[0] + ", " + resultado[1] + "]");
    }
}
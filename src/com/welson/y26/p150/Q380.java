package com.welson.y26.p150;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Q380 {
    class RandomizedSet {

        private ArrayList<Integer> nums = new ArrayList<>();
        private HashMap<Integer, Integer> indices = new HashMap<>();
        private Random random = new Random();

        public RandomizedSet() {

        }

        public boolean insert(int val) {
            if (indices.containsKey(val)) {
                return false;
            }
            nums.add(val);
            indices.put(val, nums.size());
            return true;
        }

        public boolean remove(int val) {
            if (!indices.containsKey(val)) {
                return false;
            }
            int index = indices.get(val);
            int last = nums.get(nums.size() - 1);
            nums.set(index, last);
            indices.put(last, index);
            indices.remove(val);
            nums.remove(nums.size() - 1);
            return true;
        }

        public int getRandom() {
            int ran = random.nextInt(nums.size());
            return nums.get(ran);
        }
    }
}

package com.epam.mjc.collections.combined;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> result = new ArrayList<>();
        for (String key :
                projects.keySet()) {
            if (projects.get(key).contains(developer)) {
                result.add(key);
            }
        }
        return result;
    }
}

package com.company.proj;

import java.util.Map;

public interface ItemSearchService {
    /**
     * 搜索
     *
     * @param searchMap
     * @return
     */
    public Map<String, Object> search(Map searchMap);
}

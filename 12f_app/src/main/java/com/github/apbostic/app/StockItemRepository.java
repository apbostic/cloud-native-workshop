package com.github.apbostic.app;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.github.apbostic.app.domain.model.ItemType;
import com.github.apbostic.app.domain.model.StockItem;

public interface StockItemRepository extends CrudRepository<StockItem, Long> {
    List<StockItem> findByType(ItemType type);
    /* hello */
}
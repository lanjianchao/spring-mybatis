package dao;

import model.ItemData;

public interface BomMapper {
	void insertItem(ItemData itemData);
	void updateItem(ItemData itemData);
	void deleteItem(ItemData itemData);
}

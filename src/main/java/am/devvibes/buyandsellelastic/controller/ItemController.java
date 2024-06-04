package am.devvibes.buyandsellelastic.controller;

import am.devvibes.buyandsellelastic.entity.ItemEntity;
import am.devvibes.buyandsellelastic.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/public/items")
public class ItemController {

	private final ItemService itemService;

	@GetMapping("/{id}")
	public ResponseEntity<ItemEntity> getItemById(@PathVariable Long id) {
		return ResponseEntity.ok(itemService.findItemById(id));
	}

	@GetMapping
	public ResponseEntity<List<ItemEntity>> getItemById() {
		return ResponseEntity.ok(itemService.findAllItems());
	}

}

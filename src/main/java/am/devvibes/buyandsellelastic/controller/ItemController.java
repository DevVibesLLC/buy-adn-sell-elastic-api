package am.devvibes.buyandsellelastic.controller;

import am.devvibes.buyandsellelastic.dto.FilterDto;
import am.devvibes.buyandsellelastic.entity.ItemEntity;
import am.devvibes.buyandsellelastic.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

	@PostMapping("/filter")
	public ResponseEntity<List<ItemEntity>> filterItems(@RequestBody FilterDto filterDto) {
		List<ItemEntity> entityList = itemService.filterItems(filterDto);
		return ResponseEntity.ok(entityList);
	}

}

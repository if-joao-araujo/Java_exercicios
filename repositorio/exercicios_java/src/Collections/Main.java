package Collections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main {public static void main(String[] args) {
	// ========================================
	// 1. ARRAYLIST - Lista com ordem e duplicatas
	// ========================================
	List<String> arrayList = new ArrayList<>();
	arrayList.add("Banana");
	arrayList.add("Abacaxi");
	arrayList.add("Banana"); // ✅ Permite duplicatas
	// Ordem: [Banana, Abacaxi, Banana] (mantém inserção)
	// ✅ Use quando: precisar de ordem, índice e duplicatas


	// ========================================
	// 2. HASHSET - Conjunto sem ordem e sem duplicatas
	// ========================================
	Set<String> hashSet = new HashSet<>();
	hashSet.add("Banana");
	hashSet.add("Abacaxi");
	hashSet.add("Banana"); // ❌ Ignorado (duplicata)
	// Ordem: [Abacaxi, Banana] (ordem aleatória)
	// ✅ Use quando: não quiser duplicatas e ordem não importar


	// ========================================
	// 3. HASHMAP - Não mantém ordem (o mais rápido)
	// ========================================
	Map<String, Integer> hashMap = new HashMap<>();
	hashMap.put("Zebra", 3);
	hashMap.put("Abacaxi", 1);
	hashMap.put("Banana", 2);
	// Ordem: imprevisível! {Banana=2, Zebra=3, Abacaxi=1}
	// ✅ Use quando: performance for prioridade e ordem não importar


	// ========================================
	// 4. TREEMAP - Mantém ordem natural das CHAVES (alfabética)
	// ========================================
	Map<String, Integer> treeMap = new TreeMap<>();
	treeMap.put("Zebra", 3);
	treeMap.put("Abacaxi", 1);
	treeMap.put("Banana", 2);
	// Ordem: sempre {Abacaxi=1, Banana=2, Zebra=3}
	// ✅ Use quando: precisar das chaves ordenadas automaticamente


	// ========================================
	// 5. LINKEDHASHMAP - Mantém ordem de INSERÇÃO
	// ========================================
	Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
	linkedHashMap.put("Zebra", 3);
	linkedHashMap.put("Abacaxi", 1);
	linkedHashMap.put("Banana", 2);
	// Ordem: sempre {Zebra=3, Abacaxi=1, Banana=2}
	// ✅ Use quando: precisar manter a ordem que foi adicionado

}}

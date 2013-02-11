# Algorithms

## Union Find
Basically a Union Find data structure implementations
* union(A, B) - merge A's set with B's set
* find(A) - finds what set A belongs to

### Psuedocode

    function find (var element)
      while (element is not the root) element = element's parent
      return element
    end function
  
    function union (var setA, var setB)
      var rootA = find (setA), rootB = find (setB)
      if(rootA is equal to rootB) return
      else set rootB as rootA's parent
    end function

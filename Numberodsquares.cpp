long long int numberOfSquares(long long int base)
    {
        
        base = (base - 2);
        base = floor(base / 2);
 
      return base * (base + 1)/2;
        
    }

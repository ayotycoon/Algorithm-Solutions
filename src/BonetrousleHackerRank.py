def get(n,k,b):
    low = b*(b+1)/2
    high = b*k - b*(b-1)/2
    if n>=low and n<=high:
        x = (n-low)/b
        diff = n - (x+1)*b - b*(b-1)/2
        y = range(x+1,x+1+b)
        val = y[-diff] + diff
        y[-diff] = val
        print " ".join(map(str, y))
    else:
        print -1
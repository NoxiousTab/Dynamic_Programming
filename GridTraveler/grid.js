const gridtraveler = (m, n, memo={}) => {
	const key = m + ',' + n;
	if(key in memo) return memo[key];
	if(m===1&&n===1) return 1;
	if(m===0||n==0) return 0;
	memo[key] = gridtraveler(m-1, n, memo)+gridtraveler(n-1, m, memo);
	return memo[key];
}

console.log(gridtraveler(1, 1));
console.log(gridtraveler(2, 3));
console.log(gridtraveler(3, 2));
console.log(gridtraveler(3, 3));
console.log(gridtraveler(18, 19));

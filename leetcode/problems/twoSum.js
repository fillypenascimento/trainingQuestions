/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */

// FORÇA BRUTA
// var twoSum = (nums, target) => {
//     for(let i=0; i<nums.length; i++){
//         for(let j=i+1; j<nums.length; j++){
//             if(nums[i]+nums[j] === target){
//                 return result = [i,j];
//             }
//         }
//     }
// };

// TWO-PASS HASH TABLE WITH MAP
// let twoSum = (nums, target) => {
//     let hashTable = new Map();
//
//     for(let i=0; i<nums.length; i++){
//         hashTable.set(nums[i], i);
//     }
//
//     for(let i=0; i<nums.length; i++){
//         let complement = target - nums[i];
//         if(hashTable.has(complement) && hashTable.get(complement) !== i){
//             return result = [i, hashTable.get(complement)];
//         }
//     }
//     return 'No solution available';
// }


// doesn't work
// TWO-PASS HASH TABLE WITH ARRAY
// let twoSum = (nums, target) => {
//     let hashTable = [];

//     for(let i=0; i<nums.length; i++){
//         hashTable[nums[i]] = i;
//     }

//     for(let i=0; i<nums.length; i++){
//         let complement = target - nums[i];
//         if(hashTable.indexOf(i) === complement && hashTable[complement] !== i){
//             return result = [i, hashTable[complement]];
//         }
//     }
//     return 'No solution available';
// }

// ONE-PASS HASH TABLE WITH MAP
let twoSum = (nums, target) => {
    let hashTable = new Map();
    for(let i=0; i<nums.length; i++){
        let complement = target - nums[i];
        if(hashTable.has(complement) && hashTable.get(complement) !== i){
            return result = [hashTable.get(complement), i];
        }
        hashTable.set(nums[i], i);
    }
}

// ONE-PASS HASH MAP WITH OBJECT
// let twoSum = (nums, target) => {
//     let hashTable = {};
//     for(let i=0; i<nums.length; i++){
//         console.log(i);
//         let complement = target - nums[i];
//         console.log(complement);
//         console.log('hasTable before', hashTable);
//         if(hashTable[complement] && hashTable[complement] !== i){
//             return result = [hashTable[complement], i];
//         }
//         console.log('hasTable anter', hashTable);
//         hashTable[nums[i]] = i;
//     }
// }
kSum Roof는 
선택하고 돌린 것과
선택 안하고 돌린 것의 Roof

index == 0 부터 Roof
k = 4 부터 Roof (4 : 선택된 갯수)

(1)
  * (1-1) 선택하고 돌린 것 = target - 선택, k = k - 1
    * (1-1-1) 선택하고 돌린 것 = target - 선택, k = k - 1
    * (1-1-2) 선택안하고 돌린 것 = index++, k 
  * (1-2) 선택안하고 돌린 것 = index++, k
    *  (1-2-1) 선택하고 돌린 것 = target - 선택, k = k - 1
    *  (1-2-2) 선택안하고 돌린 것 = index++, k
    * ....


(2)
위 Roof를 수행해서 k 값이 2가 되었을 때 (2가지 숫자를 선택했을 때)
TwoSum Roof를 돌린다.

twoSum(target, start, end)
* target = k를 두번 선택하면서 -된 값 (아마 2번 - 되었을 것)
  - 한마디로 (1)번 Roof의 선택 된 두 숫자를 target에서 제외한 것으로 퉁친다는 의미
 
* start = low
* end = high


  
* (2)번 Roof에서 Target이 0이 되는 값을 찾으면 그 것이 정답.


중간 값을 체크해서 현재 index의 가장 작은 값보다 작거나,
maxindex의 값보다 중간 값이 크다면
return

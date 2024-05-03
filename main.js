function clone(object) {
    let clone = {};
    for(let key in object) {
        clone[key] = object[key];
    }
    return clone;
}

let professor_role = {
    position_kind: "position_kind",
    level: "level",
    chair: "chair",
    getDescription ()  {
        return "Full name: " + this.firstname + " " + this.lastname + "\nChair: " + this.chair;
    },
    getInfo (){
        return this.getDescription() + "\nLevel: " + this.level + "\nPosition kind: " + this.position_kind;
    }
}

let makeProf = (obj, position_kind, level, chair, title) => {
    let clonedObj = clone(obj);

    clonedObj.__proto__ = professor_role;

    if (position_kind === "full professor" || position_kind === "honorary professor"  || position_kind === "Jülicher Model professor" ) {
        clonedObj.position_kind = position_kind;
    } else {
        // default
        clonedObj.position_kind = "full professor";
    }

    if (level === "W1" || level === "W2"  || level === "W3" ) {
        clonedObj.level = level;
    } else {
        // default
        clonedObj.level = "W1";
    }

    clonedObj.chair = chair;

    clonedObj.getInfo = function() {
        return this.__proto__.getInfo.call(this) + "\nTitle: " + title
    }

    clonedObj.getDescription = function() {
        return this.__proto__.getDescription.call(this) + "\nTitle: " + title
    }

    return clonedObj
}

let person1 = {
    firstname: "Max",
    lastname: "Musti",
    age: 25
}

let person2 = {
    firstname: "Steve",
    lastname: "Stansen",
    age: 29
}

let head_of_the_examination_board = makeProf(person1, "full professor", "W1", "examination board", "Head of the examination board")
let head_of_the_department = makeProf(person2, "Jülicher Model professor", "W3", "department", "Head of the department")

console.log(head_of_the_examination_board.getInfo());
console.log("")
console.log(head_of_the_department.getInfo());
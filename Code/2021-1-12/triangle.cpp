#include <stdio.h>
struct triangle {
    float length;
    float width;
    float height;
    int ISTti;
    float area;
};
void Triangle(float p1, float p2, float p3,struct triangle* t){
    t->length = p1;//
    t->width = p2;//
    t->height = p3;
}
int isTriangle(struct triangle t){
    if(t.length + t.width < t.height){
        return 0;
    }
    else if(t.length + t.height < t.width){
        return 0;
    }else if(t.width + t.height < t.length){
        return 0;
    }
    else return 1;
}
int main(void){
    struct triangle tri;
    struct triangle *p = &tri;
    float a = 1, b = 4, c = 5;
    Triangle(a, b, c, p);
    tri.ISTti = isTriangle(tri);
    printf("a = %f, b = %f, c = %f, is Triangle = %d",tri.length, tri.width, tri.height, tri.ISTti);

}

